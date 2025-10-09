import getpass
import json
import os
import re
import string
import subprocess
import sys
from typing import Callable

# ابتدا بررسی و نصب کتابخانه‌های لازم
try:
    import prompt_toolkit.lexers
    from prompt_toolkit import prompt
    from prompt_toolkit.completion import Completer, Completion
    from prompt_toolkit.document import Document
    from prompt_toolkit.formatted_text.base import StyleAndTextTuples
except ImportError:
    print("📦 Installing required libraries...")
    subprocess.run(
        [
            sys.executable or "libpython3.so",
            "-m",
            "pip",
            "install",
            "--trusted-host",
            "pypi.tuna.tsinghua.edu.cn",
            "-i",
            "https://pypi.tuna.tsinghua.edu.cn/simple/",
            "prompt_toolkit",
            "colorama",
            "termcolor",
        ]
    )
    import prompt_toolkit.lexers
    from prompt_toolkit import prompt
    from prompt_toolkit.completion import Completer, Completion
    from prompt_toolkit.document import Document
    from prompt_toolkit.formatted_text.base import StyleAndTextTuples

# سایر ایمپورت‌ها
try:
    import requests
    import jedi
    import black, rope
    import cssbeautifier
    from tqdm import tqdm
except ImportError:
    print("📦 Installing additional libraries...")
    subprocess.run(
        [
            sys.executable or "libpython3.so",
            "-m",
            "pip",
            "install",
            "--trusted-host",
            "pypi.tuna.tsinghua.edu.cn",
            "-i",
            "https://pypi.tuna.tsinghua.edu.cn/simple/",
            "requests",
            "tqdm",
            "black",
            "jedi",
            "cssbeautifier",
            "rope",
        ]
    )
    import requests
    import jedi
    import black,rope
    from tqdm import tqdm

# اضافه کردن مسیر برای import wget.py
sys.path.append("/data/data/ir.ehsancoder.nexzoide/files")


def download(uris, homeandfile):
    """
    دانلود فایل JDK از آدرس مشخص شده
    """
    url = uris
    download_path = homeandfile

    try:
        print(f"📥 Downloading from: {url}")
        print(f"📁 Saving to: {download_path}")

        # ایجاد پوشه اگر وجود ندارد
        os.makedirs(os.path.dirname(download_path), exist_ok=True)

        # دانلود با نمایش پیشرفت
        response = requests.get(url, stream=True)
        response.raise_for_status()

        total_size = int(response.headers.get("content-length", 0))

        with open(download_path, "wb") as file:
            if total_size == 0:
                # اگر سایز مشخص نیست
                file.write(response.content)
                print("✓ Download completed!")
            else:
                # با نمایش پیشرفت
                with tqdm(
                    desc="Downloading",
                    total=total_size,
                    unit="B",
                    unit_scale=True,
                    unit_divisor=1024,
                ) as progress_bar:
                    for data in response.iter_content(chunk_size=1024):
                        size = file.write(data)
                        progress_bar.update(size)

                print("✓ Download completed successfully!")

        print(f"✅ File saved: {download_path}")
        return True

    except requests.exceptions.RequestException as e:
        print(f"❌ Download failed: {e}")
        return False
    except Exception as e:
        print(f"❌ Error: {e}")
        return False


def makeBanner():
    try:
        from termcolor import colored
        from colorama import init, Fore, Style
        import black
        import jedi
        import rope
        import jsbeautifier
        import cssbeautifier

        init(autoreset=True)
    except ImportError:
        print("Install libs loading... ⏳")
        subprocess.run(
            [
                sys.executable or "libpython3.so",
                "-m",
                "pip",
                "install",
                "termcolor",
                "colorama",
                "requests",
                "black",
                "jedi",
                "jsbeautifier",
                "cssbeautifier",
                "tqdm",
                "rope",
            ]
        )
        from termcolor import colored
        from colorama import init, Fore, Style

        init(autoreset=True)

    # ASCII Art Banner
    ascii_banner = """
███╗   ██╗███████╗██╗  ██╗███████╗ ██████╗ 
████╗  ██║██╔════╝╚██╗██╔╝╚══███╔╝██╔═══██╗
██╔██╗ ██║█████╗   ╚███╔╝   ███╔╝ ██║   ██║
██║╚██╗██║██╔══╝   ██╔██╗  ███╔╝  ██║   ██║
██║ ╚████║███████╗██╔╝ ██╗███████╗╚██████╔╝
╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝
"""
    
    # Print ASCII Art in Cyan
    print(colored(ascii_banner, 'cyan'))
    
    a = """\n Nexzo IDE is a fast and free IDE for everyone\n Use the pip command to install the package\n Note that WHL libraries are only supported.\n"""
    b = """
Nexzo IDE 
appversion 1.0.0
Developer Ehsan Fazli 
pythonversion 3.11.2
    """

    colored_text = (
        f"{Fore.RED}{Style.BRIGHT}{b[:10]}"
        f"{Fore.GREEN}{Style.BRIGHT}{b[10:29]}"
        f"{Fore.CYAN}{Style.BRIGHT}{b[29:45]}"
        f"{Fore.YELLOW}{Style.BRIGHT}{b[45:]}"
    )

    text = a

    colors = ["cyan", "cyan"]

    for i, char in enumerate(text):
        color = colors[i % len(colors)]
        colored_char = colored(char, color, attrs=["bold"])
        print(colored_char, end="")
    print(colored_text)


class CustomRegexLexer(prompt_toolkit.lexers.Lexer):
    def __init__(self, regex_mapping):
        super().__init__()
        self.regex_mapping = regex_mapping

    def lex_document(self, document: Document) -> Callable[[int], StyleAndTextTuples]:
        def lex(_: int):
            line = document.text
            tokens = []
            while len(line) != 0:
                for pattern, style_string in self.regex_mapping.items():
                    match: re.Match = pattern.search(line)

                    if not match:
                        continue
                    else:
                        # print(f"found_match: {match}")
                        pass
                    match_string = line[: match.span()[1]]
                    line = line[match.span()[1] :]
                    tokens.append((style_string, match_string))
                    break
            return tokens

        return lex


def makeRegex():
    if not os.path.exists("/data/data/ir.ehsancoder.nexzoide/files/usr/bin"):
        return [
            "^python",
            "^ruby",
            "^pip",
            "^node",
            "^cpp",
            "^npm",
            "^gem",
            "^ehsanmanager",
            "^ehsanmanager",
        ]
    else:
        app = []

        for item in os.listdir("/data/data/ir.ehsancoder.nexzoide/files/usr/bin"):
            app.append(f"^{item}")

        app.append("^ehsanmanager")
        app.append("^ehsanexe")
        return app


os.system("")
stringCommands: dict = {}

numbers = re.compile(r"^\d+(\.\d+)?")
text = re.compile(r"^.")

operators = re.compile("^ehsanmanager")
op1 = re.compile("^ehsanexe")
op2 = re.compile("^python")
op3 = re.compile("^ruby")
op4 = re.compile("^pip")
op5 = re.compile("^node")
op6 = re.compile("^cpp")
op7 = re.compile("^gem")
op8 = re.compile("^npm")
regex_mapping = {
    operators: "#ffff00",
    op1: "#ffff00",
    op2: "#ffff00",
    op3: "#ffff00",
    op4: "#ffff00",
    op5: "#ffff00",
    op6: "#ffff00",
    op7: "#ffff00",
    op8: "#ffff00",
    numbers: "#ffa500",
    text: "#ffffff",
}

MyCalculatorLexer = CustomRegexLexer(regex_mapping)


class CustomCompleter(Completer):
    def get_completions(self, document, complete_event):
        if document.text_before_cursor.endswith("e"):
            yield Completion("xit", -1)

        if document.text_before_cursor.endswith("ex"):
            yield Completion("it", -1)

        if document.text_before_cursor.endswith("exi"):
            yield Completion("t", -1)

        if document.text_before_cursor.endswith("c"):
            yield Completion("d", -1)

        if document.text_before_cursor.endswith("n"):
            yield Completion("injaexe", -1)

        if document.text_before_cursor.endswith("ni"):
            yield Completion("njaexe", -1)

        if document.text_before_cursor.endswith("nin"):
            yield Completion("jaexe", -1)

        if document.text_before_cursor.endswith("ninj"):
            yield Completion("aexe", -1)

        if document.text_before_cursor.endswith("ehsan"):
            yield Completion("exe", -1)

        if document.text_before_cursor.endswith("ehsane"):
            yield Completion("xe", -1)

        if document.text_before_cursor.endswith("ehsanex"):
            yield Completion("e", -1)

        if document.text_before_cursor.endswith("n"):
            yield Completion("injamanager", -1)

        if document.text_before_cursor.endswith("ni"):
            yield Completion("njamanager", -1)

        if document.text_before_cursor.endswith("nin"):
            yield Completion("jamanager", -1)

        if document.text_before_cursor.endswith("ninj"):
            yield Completion("amanager", -1)

        if document.text_before_cursor.endswith("ehsan"):
            yield Completion("manager", -1)

        if document.text_before_cursor.endswith("ehsanm"):
            yield Completion("anager", -1)

        if document.text_before_cursor.endswith("ehsanma"):
            yield Completion("nager", -1)

        if document.text_before_cursor.endswith("ehsanman"):
            yield Completion("ager", -1)

        if document.text_before_cursor.endswith("ehsanmana"):
            yield Completion("ger", -1)

        if document.text_before_cursor.endswith("ehsanmanag"):
            yield Completion("er", -1)

        if document.text_before_cursor.endswith("ehsanmanage"):
            yield Completion("r", -1)


class BufferList(object):
    def __init__(
        self,
        List: list = [],
    ):

        self.list = List

    def parse(self):
        bfd = {}

        for i in range(len(self.list)):
            bfd["_" + str(i + 1)] = self.list[i]

        return bfd

    def isexists(self, target):
        if target in self.list:
            return True
        else:
            return False

    def isinfrontof(self, target, indexes):
        isit = False

        if target in self.list:
            try:
                indx = self.list.index(target)
                if indx == indexes:
                    isit = True
                else:
                    isit = False
            except Exception as e:
                return e

        return isit

    def indexexists(self, target):
        if target in self.list:
            return self.list.index(target)
        else:
            return False


class BufferString(object):
    def __init__(self, listed_data=[], __help: str = "", __discription: str = ""):

        self.listed_data = listed_data
        self.forHelp = __help
        self.dis = __discription
        self.status_help = True
        self.status_dis = True
        self.pyVersion = "3"
        self.data = []

    def __setcommands__(self, __key, __value):
        stringCommands[__key] = __value
        return stringCommands

    def getDictArgv(self):
        return BufferList(self.listed_data).parse()

    def addFlag(self, *flags, mode: str = "in_front_of"):
        flg = list(flags)
        for i in range(len(flg)):
            self.__setcommands__(str(i + 1), flg[i])

        if mode == "in_front_of":
            for key, val in BufferString(self.listed_data).getDictArgv().items():

                if str(val) in flg:
                    keyx = int(str(key).replace("_", ""))
                    keyx += 1
                    if (
                        not f"_{keyx}"
                        in BufferString(self.listed_data).getDictArgv().keys()
                    ):
                        self.data.append("Null")
                        pass
                    else:
                        self.data.append(
                            BufferString(self.listed_data).getDictArgv()[f"_{keyx}"]
                        )
                        pass

                else:
                    pass
            return self.data


class PipManager(object):
    def add(lib: str, use_mirror: bool = False):

        if not use_mirror:
            os.system(f"{sys.executable or 'libpython3.so'} -m pip install {lib}")
        else:
            os.system(
                f"{sys.executable or 'libpython3.so'} -m pip install --trusted-host https://pypi.tuna.tsinghua.edu.cn -i https://pypi.tuna.tsinghua.edu.cn/simple/ {lib}"
            )

    def update(lib: str, use_mirror: bool = False):

        if not use_mirror:
            os.system(
                f"{sys.executable or 'libpython3.so'} -m pip install {lib} --upgrade"
            )
        else:
            os.system(
                f"{sys.executable or 'libpython3.so'} -m pip install --trusted-host https://pypi.tuna.tsinghua.edu.cn -i https://pypi.tuna.tsinghua.edu.cn/simple/ {lib} --upgrade"
            )

    def delete(lib: str):
        os.system(f"{sys.executable or 'libpython3.so'} -m pip uninstall {lib}")

    def regular(data=""):
        os.system(f"{sys.executable or 'libpython3.so'} -m pip {data}")


class console(object):
    def logger(message: any = None):
        if type(message) in (list, tuple, dict, set):
            print(json.dumps(message, indent=4))

    def isHumanReadable(file_path):
        try:
            with open(file_path, "r") as file:
                content = file.read()
                if all(char in string.printable for char in content):
                    return True
                else:
                    return False
        except Exception as e:
            return False

    def changeDir(path: str = None):
        if not os.path.exists(path):
            print("\001\033[0;38;5;196m\002Path Does not Exists")

        if not os.path.isdir(path):
            print("\001\033[0;38;5;196m\002Does not DIR")

        else:
            os.chdir(path)
            return True

    def enableCmd(Command: str):
        if Command.startswith("cd"):
            pather = Command.replace("cd ", "")
            if pather == "cd" or pather == "":
                print("\001\033[0;38;5;196m\002Cannot get Path")
            else:
                console.changeDir(pather)

        elif Command.startswith("ehsanexe"):
            if len(Command.replace("ehsanexe ", "").split()) == 1:
                if (
                    not Command.replace("ehsanexe ", "") == "ehsanexe"
                    or not Command.replace("ehsanexe ", "") == ""
                ):
                    path = Command.replace("ehsanexe ", "").split()[0]

                    if not console.isHumanReadable(path):
                        os.system(path)
                    else:
                        dataReading = open(path, "r").read().split("\n")[0]
                        os.system(f"{dataReading.replace('#', '')} {path}")
                else:
                    pass

            elif len(Command.replace("ehsanexe ", "").split()) >= 1:
                if (
                    not Command.replace("ehsanexe ", "") == "ehsanexe"
                    or not Command.replace("ehsanexe ", "") == ""
                ):
                    path = Command.replace("ehsanexe ", "").split()[0]
                    stringArgv = " "
                    for item in Command.replace("ehsanexe ", "").split()[1:]:
                        stringArgv += f"{item} "

                    if not console.isHumanReadable(path):
                        os.system(path + stringArgv)
                    else:
                        dataReading = open(path, "r").read().split("\n")[0]
                        os.system(f"{dataReading.replace('#', '')} {path} {stringArgv}")
                else:
                    pass

        elif Command.startswith("pip"):
            datas = Command.replace("pip ", "")
            PipManager.regular(datas) if datas != "pip" else PipManager.regular()

        elif Command.startswith("python"):
            datas = Command.replace("python ", "")
            (
                os.system(f"{sys.executable or 'libpython3.so'} {datas}")
                if datas != "python"
                else os.system(sys.executable or "libpython3.so")
            )

        elif Command == "exit":
            sys.exit()
        elif Command == "home":
            console.changeDir("/sdcard/nexzoweb/")
        elif Command == "backhome":
            console.changeDir("/data/data/ir.ehsancoder.nexzoide/files")
        elif Command == "Jdk":
            download(
                "https://raw.githubusercontent.com/tsshack/tsshack/refs/heads/main/index.json",
                "/data/data/ir.ehsancoder.nexzoide/files/index.json",
            )
        elif Command.startswith("wget"):
            if Command == "wget":
                print("Usage: wget <url> [output_filename]")
            else:
                parts = Command.split()
                if len(parts) >= 2:
                    url = parts[1]
                    filename = parts[2] if len(parts) >= 3 else None

                    try:
                        if filename:
                            downloaded_file = wget.download(url, out=filename)
                        else:
                            downloaded_file = wget.download(url)
                        print(f"\n✓ Downloaded: {downloaded_file}")
                    except Exception as e:
                        print(f"❌ Download failed: {e}")
                else:
                    print("Usage: wget <url> [output_filename]")
        else:
            os.system(command=Command)

    def getCwd() -> str:
        return os.getcwd()

    def getPrompt(while_loop_starter: bool = False):

        cwd = console.getCwd()
        if cwd.startswith("/data/data/ir.ehsancoder.nexzoide"):
            cwd = cwd.replace("/data/data/ir.ehsancoder.nexzoide", "~")
        elif cwd.startswith(f"C:\\Users\\{getpass.getuser()}"):
            cwd = cwd.replace(f"C:\\Users\\{getpass.getuser()}", "~")
        else:
            pass

        if while_loop_starter == False:
            print(
                f"\001\033[0;38;5;87m\002[\001\033[0;38;5;82m\002{cwd}\001\033[0;38;5;87m\002]-[\001\033[0;38;5;82m\002ehsanShell\001\033[0;38;5;87m\002]\001\033[0;38;5;231m\002"
            )
            user_input = prompt(
                f"$ ", completer=CustomCompleter(), lexer=MyCalculatorLexer
            )

            return {"text": user_input, "splitted": user_input.split()}

        else:
            while 1:
                print(
                    f"\001\033[0;38;5;87m\002[\001\033[0;38;5;82m\002{cwd}\001\033[0;38;5;87m\002]-[\001\033[0;38;5;82m\002ehsanShell\001\033[0;38;5;87m\002]\001\033[0;38;5;231m\002"
                )
                user_input = prompt(
                    f"$ ", completer=CustomCompleter(), lexer=MyCalculatorLexer
                )
                return {"text": user_input, "splitted": user_input.split()}


try:
    makeBanner()
    while 1:
        data = console.getPrompt(True)
        console.enableCmd(data["text"])
except KeyboardInterrupt:
    sys.exit()

except Exception as E:
    print(f"\001\033[0;38;5;196m\002Local Error: {E}")
