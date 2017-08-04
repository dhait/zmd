// Generated from /Users/dhait/IdeaProjects/zmd/core/src/main/antlr4/org/optionmetrics/zmd/core/ZParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZParser}.
 */
public interface ZParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(ZParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(ZParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InheritingSection}
	 * labeled alternative in {@link ZParser#section}.
	 * @param ctx the parse tree
	 */
	void enterInheritingSection(ZParser.InheritingSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InheritingSection}
	 * labeled alternative in {@link ZParser#section}.
	 * @param ctx the parse tree
	 */
	void exitInheritingSection(ZParser.InheritingSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BaseSection}
	 * labeled alternative in {@link ZParser#section}.
	 * @param ctx the parse tree
	 */
	void enterBaseSection(ZParser.BaseSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseSection}
	 * labeled alternative in {@link ZParser#section}.
	 * @param ctx the parse tree
	 */
	void exitBaseSection(ZParser.BaseSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GivenTypesParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterGivenTypesParagraph(ZParser.GivenTypesParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GivenTypesParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitGivenTypesParagraph(ZParser.GivenTypesParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AxiomaticDescriptionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterAxiomaticDescriptionParagraph(ZParser.AxiomaticDescriptionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AxiomaticDescriptionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitAxiomaticDescriptionParagraph(ZParser.AxiomaticDescriptionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDefinitionParagraph(ZParser.SchemaDefinitionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDefinitionParagraph(ZParser.SchemaDefinitionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericAxiomaticDescriptionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterGenericAxiomaticDescriptionParagraph(ZParser.GenericAxiomaticDescriptionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericAxiomaticDescriptionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitGenericAxiomaticDescriptionParagraph(ZParser.GenericAxiomaticDescriptionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericSchemaDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterGenericSchemaDefinitionParagraph(ZParser.GenericSchemaDefinitionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericSchemaDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitGenericSchemaDefinitionParagraph(ZParser.GenericSchemaDefinitionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HorizontalDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterHorizontalDefinitionParagraph(ZParser.HorizontalDefinitionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HorizontalDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitHorizontalDefinitionParagraph(ZParser.HorizontalDefinitionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericHorizontalDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterGenericHorizontalDefinitionParagraph(ZParser.GenericHorizontalDefinitionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericHorizontalDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitGenericHorizontalDefinitionParagraph(ZParser.GenericHorizontalDefinitionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericOperatorDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterGenericOperatorDefinitionParagraph(ZParser.GenericOperatorDefinitionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericOperatorDefinitionParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitGenericOperatorDefinitionParagraph(ZParser.GenericOperatorDefinitionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FreeTypesParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterFreeTypesParagraph(ZParser.FreeTypesParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FreeTypesParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitFreeTypesParagraph(ZParser.FreeTypesParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConjectureParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterConjectureParagraph(ZParser.ConjectureParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConjectureParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitConjectureParagraph(ZParser.ConjectureParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericConjectureParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterGenericConjectureParagraph(ZParser.GenericConjectureParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericConjectureParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitGenericConjectureParagraph(ZParser.GenericConjectureParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorTemplateParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterOperatorTemplateParagraph(ZParser.OperatorTemplateParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorTemplateParagraph}
	 * labeled alternative in {@link ZParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitOperatorTemplateParagraph(ZParser.OperatorTemplateParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#freetype}.
	 * @param ctx the parse tree
	 */
	void enterFreetype(ZParser.FreetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#freetype}.
	 * @param ctx the parse tree
	 */
	void exitFreetype(ZParser.FreetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(ZParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(ZParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(ZParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(ZParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistentialQuantificationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantificationPredicate(ZParser.ExistentialQuantificationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistentialQuantificationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantificationPredicate(ZParser.ExistentialQuantificationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionPredicate(ZParser.ConjunctionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionPredicate(ZParser.ConjunctionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EquivalencePredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterEquivalencePredicate(ZParser.EquivalencePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EquivalencePredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitEquivalencePredicate(ZParser.EquivalencePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewlineConjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNewlineConjunctionPredicate(ZParser.NewlineConjunctionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewlineConjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNewlineConjunctionPredicate(ZParser.NewlineConjunctionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImplicationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterImplicationPredicate(ZParser.ImplicationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImplicationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitImplicationPredicate(ZParser.ImplicationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationOperatorApplicationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperatorApplicationPredicate(ZParser.RelationOperatorApplicationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationOperatorApplicationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperatorApplicationPredicate(ZParser.RelationOperatorApplicationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UniversalQuantificationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantificationPredicate(ZParser.UniversalQuantificationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UniversalQuantificationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantificationPredicate(ZParser.UniversalQuantificationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TruthPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterTruthPredicate(ZParser.TruthPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TruthPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitTruthPredicate(ZParser.TruthPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalsityPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterFalsityPredicate(ZParser.FalsityPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalsityPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitFalsityPredicate(ZParser.FalsityPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedPredicate(ZParser.ParenthesizedPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedPredicate(ZParser.ParenthesizedPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionPredicate(ZParser.DisjunctionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionPredicate(ZParser.DisjunctionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SemicolonConjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSemicolonConjunctionPredicate(ZParser.SemicolonConjunctionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SemicolonConjunctionPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSemicolonConjunctionPredicate(ZParser.SemicolonConjunctionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaPredicatePredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPredicatePredicate(ZParser.SchemaPredicatePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaPredicatePredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPredicatePredicate(ZParser.SchemaPredicatePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UniqueExistentialQuantificationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterUniqueExistentialQuantificationPredicate(ZParser.UniqueExistentialQuantificationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UniqueExistentialQuantificationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitUniqueExistentialQuantificationPredicate(ZParser.UniqueExistentialQuantificationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNegationPredicate(ZParser.NegationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationPredicate}
	 * labeled alternative in {@link ZParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNegationPredicate(ZParser.NegationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetComprehensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetComprehensionExpression(ZParser.SetComprehensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetComprehensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetComprehensionExpression(ZParser.SetComprehensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaEquivalenceExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaEquivalenceExpression(ZParser.SchemaEquivalenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaEquivalenceExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaEquivalenceExpression(ZParser.SchemaEquivalenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NofixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNofixApplicationExpression(ZParser.NofixApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NofixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNofixApplicationExpression(ZParser.NofixApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaConstructionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaConstructionExpression(ZParser.SchemaConstructionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaConstructionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaConstructionExpression(ZParser.SchemaConstructionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericPostfixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericPostfixApplicationExpression(ZParser.GenericPostfixApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericPostfixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericPostfixApplicationExpression(ZParser.GenericPostfixApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericPrefixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericPrefixApplicationExpression(ZParser.GenericPrefixApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericPrefixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericPrefixApplicationExpression(ZParser.GenericPrefixApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacteristicDefiniteDescriptionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacteristicDefiniteDescriptionExpression(ZParser.CharacteristicDefiniteDescriptionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacteristicDefiniteDescriptionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacteristicDefiniteDescriptionExpression(ZParser.CharacteristicDefiniteDescriptionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaUniversalQuantificationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaUniversalQuantificationExpression(ZParser.SchemaUniversalQuantificationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaUniversalQuantificationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaUniversalQuantificationExpression(ZParser.SchemaUniversalQuantificationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetExtensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetExtensionExpression(ZParser.SetExtensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetExtensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetExtensionExpression(ZParser.SetExtensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionConstructionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionConstructionExpression(ZParser.FunctionConstructionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionConstructionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionConstructionExpression(ZParser.FunctionConstructionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaNegationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNegationExpression(ZParser.SchemaNegationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaNegationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNegationExpression(ZParser.SchemaNegationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleExtensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExtensionExpression(ZParser.TupleExtensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleExtensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExtensionExpression(ZParser.TupleExtensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaCompositionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaCompositionExpression(ZParser.SchemaCompositionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaCompositionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaCompositionExpression(ZParser.SchemaCompositionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowersetExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowersetExpression(ZParser.PowersetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowersetExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowersetExpression(ZParser.PowersetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDisjunctionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDisjunctionExpression(ZParser.SchemaDisjunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDisjunctionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDisjunctionExpression(ZParser.SchemaDisjunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubstitutionExpressionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutionExpressionExpression(ZParser.SubstitutionExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubstitutionExpressionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutionExpressionExpression(ZParser.SubstitutionExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaHidingExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaHidingExpression(ZParser.SchemaHidingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaHidingExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaHidingExpression(ZParser.SchemaHidingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixApplicationExpression(ZParser.PostfixApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixApplicationExpression(ZParser.PostfixApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CartesianProductExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCartesianProductExpression(ZParser.CartesianProductExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CartesianProductExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCartesianProductExpression(ZParser.CartesianProductExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingSelectionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBindingSelectionExpression(ZParser.BindingSelectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingSelectionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBindingSelectionExpression(ZParser.BindingSelectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericInstantiationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericInstantiationExpression(ZParser.GenericInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericInstantiationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericInstantiationExpression(ZParser.GenericInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaExistentialQuantificationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaExistentialQuantificationExpression(ZParser.SchemaExistentialQuantificationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaExistentialQuantificationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaExistentialQuantificationExpression(ZParser.SchemaExistentialQuantificationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteralExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteralExpression(ZParser.NumberLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteralExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteralExpression(ZParser.NumberLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ZParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ZParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixLeftApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixLeftApplicationExpression(ZParser.InfixLeftApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixLeftApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixLeftApplicationExpression(ZParser.InfixLeftApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterApplicationExpression(ZParser.ApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitApplicationExpression(ZParser.ApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaRenamingExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaRenamingExpression(ZParser.SchemaRenamingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaRenamingExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaRenamingExpression(ZParser.SchemaRenamingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaConjunctionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaConjunctionExpression(ZParser.SchemaConjunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaConjunctionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaConjunctionExpression(ZParser.SchemaConjunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ZParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ZParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaProjectionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaProjectionExpression(ZParser.SchemaProjectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaProjectionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaProjectionExpression(ZParser.SchemaProjectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InfixRightApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixRightApplicationExpression(ZParser.InfixRightApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InfixRightApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixRightApplicationExpression(ZParser.InfixRightApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharacteristicSetComprehensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacteristicSetComprehensionExpression(ZParser.CharacteristicSetComprehensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharacteristicSetComprehensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacteristicSetComprehensionExpression(ZParser.CharacteristicSetComprehensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaPreconditionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPreconditionExpression(ZParser.SchemaPreconditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaPreconditionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPreconditionExpression(ZParser.SchemaPreconditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrefixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixApplicationExpression(ZParser.PrefixApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrefixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixApplicationExpression(ZParser.PrefixApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingConstructionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBindingConstructionExpression(ZParser.BindingConstructionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingConstructionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBindingConstructionExpression(ZParser.BindingConstructionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaPipingExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPipingExpression(ZParser.SchemaPipingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaPipingExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPipingExpression(ZParser.SchemaPipingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaImplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaImplicationExpression(ZParser.SchemaImplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaImplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaImplicationExpression(ZParser.SchemaImplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingExtensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBindingExtensionExpression(ZParser.BindingExtensionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingExtensionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBindingExtensionExpression(ZParser.BindingExtensionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDecorationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDecorationExpression(ZParser.SchemaDecorationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDecorationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDecorationExpression(ZParser.SchemaDecorationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaUniqueExistentialQuantificationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSchemaUniqueExistentialQuantificationExpression(ZParser.SchemaUniqueExistentialQuantificationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaUniqueExistentialQuantificationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSchemaUniqueExistentialQuantificationExpression(ZParser.SchemaUniqueExistentialQuantificationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefiniteDescriptionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteDescriptionExpression(ZParser.DefiniteDescriptionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefiniteDescriptionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteDescriptionExpression(ZParser.DefiniteDescriptionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(ZParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReferenceExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(ZParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericInfixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericInfixApplicationExpression(ZParser.GenericInfixApplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericInfixApplicationExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericInfixApplicationExpression(ZParser.GenericInfixApplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleSelectionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTupleSelectionExpression(ZParser.TupleSelectionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleSelectionExpression}
	 * labeled alternative in {@link ZParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTupleSelectionExpression(ZParser.TupleSelectionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#schemaText}.
	 * @param ctx the parse tree
	 */
	void enterSchemaText(ZParser.SchemaTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#schemaText}.
	 * @param ctx the parse tree
	 */
	void exitSchemaText(ZParser.SchemaTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#declPart}.
	 * @param ctx the parse tree
	 */
	void enterDeclPart(ZParser.DeclPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#declPart}.
	 * @param ctx the parse tree
	 */
	void exitDeclPart(ZParser.DeclPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#declNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeclNameExpression(ZParser.DeclNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#declNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeclNameExpression(ZParser.DeclNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ZParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ZParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void enterOperatorTemplate(ZParser.OperatorTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void exitOperatorTemplate(ZParser.OperatorTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#categoryTemplate}.
	 * @param ctx the parse tree
	 */
	void enterCategoryTemplate(ZParser.CategoryTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#categoryTemplate}.
	 * @param ctx the parse tree
	 */
	void exitCategoryTemplate(ZParser.CategoryTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#prec}.
	 * @param ctx the parse tree
	 */
	void enterPrec(ZParser.PrecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#prec}.
	 * @param ctx the parse tree
	 */
	void exitPrec(ZParser.PrecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#assoc}.
	 * @param ctx the parse tree
	 */
	void enterAssoc(ZParser.AssocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#assoc}.
	 * @param ctx the parse tree
	 */
	void exitAssoc(ZParser.AssocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(ZParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(ZParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#prefixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterPrefixTemplate(ZParser.PrefixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#prefixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitPrefixTemplate(ZParser.PrefixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#postfixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterPostfixTemplate(ZParser.PostfixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#postfixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitPostfixTemplate(ZParser.PostfixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#infixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterInfixTemplate(ZParser.InfixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#infixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitInfixTemplate(ZParser.InfixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#nofixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterNofixTemplate(ZParser.NofixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#nofixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitNofixTemplate(ZParser.NofixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#declName}.
	 * @param ctx the parse tree
	 */
	void enterDeclName(ZParser.DeclNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#declName}.
	 * @param ctx the parse tree
	 */
	void exitDeclName(ZParser.DeclNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#refName}.
	 * @param ctx the parse tree
	 */
	void enterRefName(ZParser.RefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#refName}.
	 * @param ctx the parse tree
	 */
	void exitRefName(ZParser.RefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#opName}.
	 * @param ctx the parse tree
	 */
	void enterOpName(ZParser.OpNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#opName}.
	 * @param ctx the parse tree
	 */
	void exitOpName(ZParser.OpNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#prefixName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixName(ZParser.PrefixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#prefixName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixName(ZParser.PrefixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#postfixName}.
	 * @param ctx the parse tree
	 */
	void enterPostfixName(ZParser.PostfixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#postfixName}.
	 * @param ctx the parse tree
	 */
	void exitPostfixName(ZParser.PostfixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#infixName}.
	 * @param ctx the parse tree
	 */
	void enterInfixName(ZParser.InfixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#infixName}.
	 * @param ctx the parse tree
	 */
	void exitInfixName(ZParser.InfixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#nofixName}.
	 * @param ctx the parse tree
	 */
	void enterNofixName(ZParser.NofixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#nofixName}.
	 * @param ctx the parse tree
	 */
	void exitNofixName(ZParser.NofixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#genName}.
	 * @param ctx the parse tree
	 */
	void enterGenName(ZParser.GenNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#genName}.
	 * @param ctx the parse tree
	 */
	void exitGenName(ZParser.GenNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#prefixGenName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixGenName(ZParser.PrefixGenNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#prefixGenName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixGenName(ZParser.PrefixGenNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#postfixGenName}.
	 * @param ctx the parse tree
	 */
	void enterPostfixGenName(ZParser.PostfixGenNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#postfixGenName}.
	 * @param ctx the parse tree
	 */
	void exitPostfixGenName(ZParser.PostfixGenNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#infixGenName}.
	 * @param ctx the parse tree
	 */
	void enterInfixGenName(ZParser.InfixGenNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#infixGenName}.
	 * @param ctx the parse tree
	 */
	void exitInfixGenName(ZParser.InfixGenNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#nofixGenName}.
	 * @param ctx the parse tree
	 */
	void enterNofixGenName(ZParser.NofixGenNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#nofixGenName}.
	 * @param ctx the parse tree
	 */
	void exitNofixGenName(ZParser.NofixGenNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ZParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ZParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#prefixRel}.
	 * @param ctx the parse tree
	 */
	void enterPrefixRel(ZParser.PrefixRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#prefixRel}.
	 * @param ctx the parse tree
	 */
	void exitPrefixRel(ZParser.PrefixRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#postfixRel}.
	 * @param ctx the parse tree
	 */
	void enterPostfixRel(ZParser.PostfixRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#postfixRel}.
	 * @param ctx the parse tree
	 */
	void exitPostfixRel(ZParser.PostfixRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#infixRel}.
	 * @param ctx the parse tree
	 */
	void enterInfixRel(ZParser.InfixRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#infixRel}.
	 * @param ctx the parse tree
	 */
	void exitInfixRel(ZParser.InfixRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#nofixRel}.
	 * @param ctx the parse tree
	 */
	void enterNofixRel(ZParser.NofixRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#nofixRel}.
	 * @param ctx the parse tree
	 */
	void exitNofixRel(ZParser.NofixRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(ZParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(ZParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#prefixApp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixApp(ZParser.PrefixAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#prefixApp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixApp(ZParser.PrefixAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#postfixApp}.
	 * @param ctx the parse tree
	 */
	void enterPostfixApp(ZParser.PostfixAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#postfixApp}.
	 * @param ctx the parse tree
	 */
	void exitPostfixApp(ZParser.PostfixAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#infixApp}.
	 * @param ctx the parse tree
	 */
	void enterInfixApp(ZParser.InfixAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#infixApp}.
	 * @param ctx the parse tree
	 */
	void exitInfixApp(ZParser.InfixAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#nofixApp}.
	 * @param ctx the parse tree
	 */
	void enterNofixApp(ZParser.NofixAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#nofixApp}.
	 * @param ctx the parse tree
	 */
	void exitNofixApp(ZParser.NofixAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#expSep}.
	 * @param ctx the parse tree
	 */
	void enterExpSep(ZParser.ExpSepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#expSep}.
	 * @param ctx the parse tree
	 */
	void exitExpSep(ZParser.ExpSepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ZParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ZParser.ExpressionListContext ctx);
}