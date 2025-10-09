// Generated from /storage/emulated/0/AndroidIDEProjects/nexzo-web-ide/grammars-v4/pydatajava/ehsan9.g4 by ANTLR 4.13.1
package org.antlr.parser.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ehsan9Parser}.
 */
public interface ehsan9Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ehsan9Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ehsan9Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ehsan9Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ehsan9Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ehsan9Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ehsan9Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatingPointLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointLiteral(ehsan9Parser.FloatingPointLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatingPointLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointLiteral(ehsan9Parser.FloatingPointLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ehsan9Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ehsan9Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterCharacterLiteral(ehsan9Parser.CharacterLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacterLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitCharacterLiteral(ehsan9Parser.CharacterLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ehsan9Parser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ehsan9Parser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ehsan9Parser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ehsan9Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ehsan9Parser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ehsan9Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ehsan9Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ehsan9Parser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ehsan9Parser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(ehsan9Parser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(ehsan9Parser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(ehsan9Parser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(ehsan9Parser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(ehsan9Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(ehsan9Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(ehsan9Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(ehsan9Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(ehsan9Parser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(ehsan9Parser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ehsan9Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ehsan9Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeName(ehsan9Parser.ArrayTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayTypeName}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeName(ehsan9Parser.ArrayTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(ehsan9Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(ehsan9Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayDimension}.
	 * @param ctx the parse tree
	 */
	void enterArrayDimension(ehsan9Parser.ArrayDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayDimension}.
	 * @param ctx the parse tree
	 */
	void exitArrayDimension(ehsan9Parser.ArrayDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ehsan9Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ehsan9Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypeBound}
	 * labeled alternative in {@link ehsan9Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeBound(ehsan9Parser.SimpleTypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypeBound}
	 * labeled alternative in {@link ehsan9Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeBound(ehsan9Parser.SimpleTypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classTypeBound}
	 * labeled alternative in {@link ehsan9Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterClassTypeBound(ehsan9Parser.ClassTypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classTypeBound}
	 * labeled alternative in {@link ehsan9Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitClassTypeBound(ehsan9Parser.ClassTypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(ehsan9Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(ehsan9Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ehsan9Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ehsan9Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(ehsan9Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(ehsan9Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ehsan9Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ehsan9Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(ehsan9Parser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(ehsan9Parser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(ehsan9Parser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(ehsan9Parser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#wildcardType}.
	 * @param ctx the parse tree
	 */
	void enterWildcardType(ehsan9Parser.WildcardTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#wildcardType}.
	 * @param ctx the parse tree
	 */
	void exitWildcardType(ehsan9Parser.WildcardTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ehsan9Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ehsan9Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#propertyLookup}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLookup(ehsan9Parser.PropertyLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#propertyLookup}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLookup(ehsan9Parser.PropertyLookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(ehsan9Parser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(ehsan9Parser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(ehsan9Parser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(ehsan9Parser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ehsan9Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ehsan9Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#import_static}.
	 * @param ctx the parse tree
	 */
	void enterImport_static(ehsan9Parser.Import_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#import_static}.
	 * @param ctx the parse tree
	 */
	void exitImport_static(ehsan9Parser.Import_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#import_wildcard}.
	 * @param ctx the parse tree
	 */
	void enterImport_wildcard(ehsan9Parser.Import_wildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#import_wildcard}.
	 * @param ctx the parse tree
	 */
	void exitImport_wildcard(ehsan9Parser.Import_wildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ehsan9Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ehsan9Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ehsan9Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ehsan9Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ehsan9Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ehsan9Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(ehsan9Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(ehsan9Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ehsan9Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ehsan9Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(ehsan9Parser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(ehsan9Parser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(ehsan9Parser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(ehsan9Parser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(ehsan9Parser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(ehsan9Parser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ehsan9Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ehsan9Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ehsan9Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ehsan9Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ehsan9Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ehsan9Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(ehsan9Parser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(ehsan9Parser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ehsan9Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ehsan9Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ehsan9Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ehsan9Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ehsan9Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ehsan9Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(ehsan9Parser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(ehsan9Parser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(ehsan9Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(ehsan9Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(ehsan9Parser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(ehsan9Parser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(ehsan9Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(ehsan9Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(ehsan9Parser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(ehsan9Parser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(ehsan9Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(ehsan9Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(ehsan9Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(ehsan9Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(ehsan9Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(ehsan9Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(ehsan9Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(ehsan9Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(ehsan9Parser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(ehsan9Parser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(ehsan9Parser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(ehsan9Parser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ehsan9Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ehsan9Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(ehsan9Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(ehsan9Parser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(ehsan9Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(ehsan9Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(ehsan9Parser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(ehsan9Parser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ehsan9Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ehsan9Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ehsan9Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ehsan9Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ehsan9Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ehsan9Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ehsan9Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ehsan9Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(ehsan9Parser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(ehsan9Parser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(ehsan9Parser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(ehsan9Parser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(ehsan9Parser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(ehsan9Parser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(ehsan9Parser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(ehsan9Parser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ehsan9Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ehsan9Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(ehsan9Parser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(ehsan9Parser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(ehsan9Parser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(ehsan9Parser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ehsan9Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ehsan9Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(ehsan9Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(ehsan9Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(ehsan9Parser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(ehsan9Parser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(ehsan9Parser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(ehsan9Parser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(ehsan9Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(ehsan9Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ehsan9Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ehsan9Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(ehsan9Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(ehsan9Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(ehsan9Parser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(ehsan9Parser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ehsan9Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ehsan9Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ehsan9Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ehsan9Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ehsan9Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ehsan9Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(ehsan9Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(ehsan9Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(ehsan9Parser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(ehsan9Parser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ehsan9Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ehsan9Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ehsan9Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ehsan9Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(ehsan9Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(ehsan9Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ehsan9Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ehsan9Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(ehsan9Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(ehsan9Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(ehsan9Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(ehsan9Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(ehsan9Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(ehsan9Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(ehsan9Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(ehsan9Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(ehsan9Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(ehsan9Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ehsan9Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ehsan9Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(ehsan9Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(ehsan9Parser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(ehsan9Parser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(ehsan9Parser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(ehsan9Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(ehsan9Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementValueExpression}
	 * labeled alternative in {@link ehsan9Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValueExpression(ehsan9Parser.ElementValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementValueExpression}
	 * labeled alternative in {@link ehsan9Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValueExpression(ehsan9Parser.ElementValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementValueArray}
	 * labeled alternative in {@link ehsan9Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArray(ehsan9Parser.ElementValueArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementValueArray}
	 * labeled alternative in {@link ehsan9Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArray(ehsan9Parser.ElementValueArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementValueAnnotation}
	 * labeled alternative in {@link ehsan9Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValueAnnotation(ehsan9Parser.ElementValueAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementValueAnnotation}
	 * labeled alternative in {@link ehsan9Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValueAnnotation(ehsan9Parser.ElementValueAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(ehsan9Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(ehsan9Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(ehsan9Parser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(ehsan9Parser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(ehsan9Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(ehsan9Parser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(ehsan9Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(ehsan9Parser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ehsan9Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ehsan9Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(ehsan9Parser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(ehsan9Parser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ehsan9Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ehsan9Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ehsan9Parser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ehsan9Parser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ehsan9Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ehsan9Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ehsan9Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ehsan9Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ehsan9Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ehsan9Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ehsan9Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ehsan9Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(ehsan9Parser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(ehsan9Parser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(ehsan9Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(ehsan9Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ehsan9Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ehsan9Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(ehsan9Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(ehsan9Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(ehsan9Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(ehsan9Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ehsan9Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ehsan9Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ehsan9Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ehsan9Parser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementAssignment_nocol}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment_nocol(ehsan9Parser.StatementAssignment_nocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementAssignment_nocol}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment_nocol(ehsan9Parser.StatementAssignment_nocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementPre_nocol}.
	 * @param ctx the parse tree
	 */
	void enterStatementPre_nocol(ehsan9Parser.StatementPre_nocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementPre_nocol}.
	 * @param ctx the parse tree
	 */
	void exitStatementPre_nocol(ehsan9Parser.StatementPre_nocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementPost_nocol}.
	 * @param ctx the parse tree
	 */
	void enterStatementPost_nocol(ehsan9Parser.StatementPost_nocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementPost_nocol}.
	 * @param ctx the parse tree
	 */
	void exitStatementPost_nocol(ehsan9Parser.StatementPost_nocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementMethodInvocation_nocol}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodInvocation_nocol(ehsan9Parser.StatementMethodInvocation_nocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementMethodInvocation_nocol}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodInvocation_nocol(ehsan9Parser.StatementMethodInvocation_nocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementClassInstanceCreation_nocol}.
	 * @param ctx the parse tree
	 */
	void enterStatementClassInstanceCreation_nocol(ehsan9Parser.StatementClassInstanceCreation_nocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementClassInstanceCreation_nocol}.
	 * @param ctx the parse tree
	 */
	void exitStatementClassInstanceCreation_nocol(ehsan9Parser.StatementClassInstanceCreation_nocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(ehsan9Parser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(ehsan9Parser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(ehsan9Parser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(ehsan9Parser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(ehsan9Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(ehsan9Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(ehsan9Parser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(ehsan9Parser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ehsan9Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ehsan9Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ehsan9Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ehsan9Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(ehsan9Parser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(ehsan9Parser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#defaultSwitchCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSwitchCase(ehsan9Parser.DefaultSwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#defaultSwitchCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSwitchCase(ehsan9Parser.DefaultSwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ehsan9Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ehsan9Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(ehsan9Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(ehsan9Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ehsan9Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ehsan9Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ehsan9Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ehsan9Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(ehsan9Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(ehsan9Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(ehsan9Parser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(ehsan9Parser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(ehsan9Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(ehsan9Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ehsan9Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ehsan9Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ehsan9Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ehsan9Parser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(ehsan9Parser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(ehsan9Parser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(ehsan9Parser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(ehsan9Parser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(ehsan9Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(ehsan9Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ehsan9Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ehsan9Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ehsan9Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ehsan9Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ehsan9Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ehsan9Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ehsan9Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ehsan9Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(ehsan9Parser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(ehsan9Parser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ehsan9Parser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ehsan9Parser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchStatement}
	 * labeled alternative in {@link ehsan9Parser#basicTryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStatement(ehsan9Parser.TryCatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchStatement}
	 * labeled alternative in {@link ehsan9Parser#basicTryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStatement(ehsan9Parser.TryCatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link ehsan9Parser#basicTryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchFinallyStatement(ehsan9Parser.TryCatchFinallyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchFinallyStatement}
	 * labeled alternative in {@link ehsan9Parser#basicTryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchFinallyStatement(ehsan9Parser.TryCatchFinallyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(ehsan9Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(ehsan9Parser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ehsan9Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ehsan9Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(ehsan9Parser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(ehsan9Parser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(ehsan9Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(ehsan9Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(ehsan9Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(ehsan9Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(ehsan9Parser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(ehsan9Parser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ehsan9Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ehsan9Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ehsan9Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ehsan9Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#expressionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParenthesis(ehsan9Parser.ExpressionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#expressionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParenthesis(ehsan9Parser.ExpressionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(ehsan9Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(ehsan9Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(ehsan9Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(ehsan9Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(ehsan9Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(ehsan9Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ehsan9Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ehsan9Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ehsan9Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ehsan9Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryClassType}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryClassType(ehsan9Parser.PrimaryClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryClassType}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryClassType(ehsan9Parser.PrimaryClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryClassTypeAlternates}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryClassTypeAlternates(ehsan9Parser.PrimaryClassTypeAlternatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryClassTypeAlternates}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryClassTypeAlternates(ehsan9Parser.PrimaryClassTypeAlternatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(ehsan9Parser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(ehsan9Parser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#bracketPair}.
	 * @param ctx the parse tree
	 */
	void enterBracketPair(ehsan9Parser.BracketPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#bracketPair}.
	 * @param ctx the parse tree
	 */
	void exitBracketPair(ehsan9Parser.BracketPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(ehsan9Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(ehsan9Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ehsan9Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ehsan9Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ehsan9Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ehsan9Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterClassIdentifier(ehsan9Parser.ClassIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitClassIdentifier(ehsan9Parser.ClassIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(ehsan9Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(ehsan9Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(ehsan9Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(ehsan9Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(ehsan9Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(ehsan9Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ig22}
	 * labeled alternative in {@link ehsan9Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterIg22(ehsan9Parser.Ig22Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ig22}
	 * labeled alternative in {@link ehsan9Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitIg22(ehsan9Parser.Ig22Context ctx);
	/**
	 * Enter a parse tree produced by the {@code diamond}
	 * labeled alternative in {@link ehsan9Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterDiamond(ehsan9Parser.DiamondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diamond}
	 * labeled alternative in {@link ehsan9Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitDiamond(ehsan9Parser.DiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(ehsan9Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(ehsan9Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(ehsan9Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(ehsan9Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(ehsan9Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(ehsan9Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ehsan9Parser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ehsan9Parser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(ehsan9Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(ehsan9Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(ehsan9Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(ehsan9Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(ehsan9Parser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(ehsan9Parser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodArea}.
	 * @param ctx the parse tree
	 */
	void enterMethodArea(ehsan9Parser.MethodAreaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodArea}.
	 * @param ctx the parse tree
	 */
	void exitMethodArea(ehsan9Parser.MethodAreaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(ehsan9Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(ehsan9Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(ehsan9Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(ehsan9Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ehsan9Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ehsan9Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(ehsan9Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(ehsan9Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(ehsan9Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(ehsan9Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(ehsan9Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(ehsan9Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(ehsan9Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(ehsan9Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(ehsan9Parser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(ehsan9Parser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(ehsan9Parser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(ehsan9Parser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ehsan9Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ehsan9Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(ehsan9Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(ehsan9Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(ehsan9Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(ehsan9Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaInferedParameterList}
	 * labeled alternative in {@link ehsan9Parser#lambdaInteredParameterList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaInferedParameterList(ehsan9Parser.LambdaInferedParameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaInferedParameterList}
	 * labeled alternative in {@link ehsan9Parser#lambdaInteredParameterList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaInferedParameterList(ehsan9Parser.LambdaInferedParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#lambdaIdentifierParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIdentifierParameter(ehsan9Parser.LambdaIdentifierParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#lambdaIdentifierParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIdentifierParameter(ehsan9Parser.LambdaIdentifierParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#lambdaParameterList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameterList(ehsan9Parser.LambdaParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#lambdaParameterList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameterList(ehsan9Parser.LambdaParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(ehsan9Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(ehsan9Parser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(ehsan9Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(ehsan9Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ehsan9Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ehsan9Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ehsan9Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ehsan9Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(ehsan9Parser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(ehsan9Parser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ehsan9Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ehsan9Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#leftRightOperator}.
	 * @param ctx the parse tree
	 */
	void enterLeftRightOperator(ehsan9Parser.LeftRightOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#leftRightOperator}.
	 * @param ctx the parse tree
	 */
	void exitLeftRightOperator(ehsan9Parser.LeftRightOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ig18}
	 * labeled alternative in {@link ehsan9Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIg18(ehsan9Parser.Ig18Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ig18}
	 * labeled alternative in {@link ehsan9Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIg18(ehsan9Parser.Ig18Context ctx);
	/**
	 * Enter a parse tree produced by the {@code leftRightExpression}
	 * labeled alternative in {@link ehsan9Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLeftRightExpression(ehsan9Parser.LeftRightExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftRightExpression}
	 * labeled alternative in {@link ehsan9Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLeftRightExpression(ehsan9Parser.LeftRightExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalTernary}
	 * labeled alternative in {@link ehsan9Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalTernary(ehsan9Parser.ConditionalTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalTernary}
	 * labeled alternative in {@link ehsan9Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalTernary(ehsan9Parser.ConditionalTernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ehsan9Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ehsan9Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(ehsan9Parser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(ehsan9Parser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(ehsan9Parser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(ehsan9Parser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(ehsan9Parser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(ehsan9Parser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#preExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreExpression(ehsan9Parser.PreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#preExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreExpression(ehsan9Parser.PreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(ehsan9Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(ehsan9Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(ehsan9Parser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(ehsan9Parser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#postExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostExpression(ehsan9Parser.PostExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#postExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostExpression(ehsan9Parser.PostExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ehsan9Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ehsan9Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#castPrimitive}.
	 * @param ctx the parse tree
	 */
	void enterCastPrimitive(ehsan9Parser.CastPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#castPrimitive}.
	 * @param ctx the parse tree
	 */
	void exitCastPrimitive(ehsan9Parser.CastPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#castReference}.
	 * @param ctx the parse tree
	 */
	void enterCastReference(ehsan9Parser.CastReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#castReference}.
	 * @param ctx the parse tree
	 */
	void exitCastReference(ehsan9Parser.CastReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ehsan9Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ehsan9Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ehsan9Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ehsan9Parser.IdentifierContext ctx);
}