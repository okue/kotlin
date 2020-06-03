/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.perf;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/indentationOnNewline")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class PerformanceTypingIndentationTestGenerated extends AbstractPerformanceTypingIndentationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doPerfTest, this, testDataFilePath);
    }

    @TestMetadata("AfterCatch.kt")
    public void testAfterCatch() throws Exception {
        runTest("idea/testData/indentationOnNewline/AfterCatch.kt");
    }

    @TestMetadata("AfterClassNameBeforeFun.kt")
    public void testAfterClassNameBeforeFun() throws Exception {
        runTest("idea/testData/indentationOnNewline/AfterClassNameBeforeFun.kt");
    }

    @TestMetadata("AfterFinally.kt")
    public void testAfterFinally() throws Exception {
        runTest("idea/testData/indentationOnNewline/AfterFinally.kt");
    }

    @TestMetadata("AfterImport.kt")
    public void testAfterImport() throws Exception {
        runTest("idea/testData/indentationOnNewline/AfterImport.kt");
    }

    @TestMetadata("AfterTry.kt")
    public void testAfterTry() throws Exception {
        runTest("idea/testData/indentationOnNewline/AfterTry.kt");
    }

    public void testAllFilesPresentInIndentationOnNewline() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/indentationOnNewline"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
    }

    @TestMetadata("Annotation.kt")
    public void testAnnotation() throws Exception {
        runTest("idea/testData/indentationOnNewline/Annotation.kt");
    }

    @TestMetadata("AnnotationInDeclaration.kt")
    public void testAnnotationInDeclaration() throws Exception {
        runTest("idea/testData/indentationOnNewline/AnnotationInDeclaration.kt");
    }

    @TestMetadata("ArgumentListNormalIndent.kt")
    public void testArgumentListNormalIndent() throws Exception {
        runTest("idea/testData/indentationOnNewline/ArgumentListNormalIndent.kt");
    }

    @TestMetadata("AssignmentAfterEq.kt")
    public void testAssignmentAfterEq() throws Exception {
        runTest("idea/testData/indentationOnNewline/AssignmentAfterEq.kt");
    }

    @TestMetadata("BinaryWithTypeExpressions.kt")
    public void testBinaryWithTypeExpressions() throws Exception {
        runTest("idea/testData/indentationOnNewline/BinaryWithTypeExpressions.kt");
    }

    @TestMetadata("Catch.kt")
    public void testCatch() throws Exception {
        runTest("idea/testData/indentationOnNewline/Catch.kt");
    }

    @TestMetadata("Catch2.kt")
    public void testCatch2() throws Exception {
        runTest("idea/testData/indentationOnNewline/Catch2.kt");
    }

    @TestMetadata("Catch3.kt")
    public void testCatch3() throws Exception {
        runTest("idea/testData/indentationOnNewline/Catch3.kt");
    }

    @TestMetadata("ConsecutiveCallsAfterDot.kt")
    public void testConsecutiveCallsAfterDot() throws Exception {
        runTest("idea/testData/indentationOnNewline/ConsecutiveCallsAfterDot.kt");
    }

    @TestMetadata("ConsecutiveCallsInSaeCallsMiddle.kt")
    public void testConsecutiveCallsInSaeCallsMiddle() throws Exception {
        runTest("idea/testData/indentationOnNewline/ConsecutiveCallsInSaeCallsMiddle.kt");
    }

    @TestMetadata("ConsecutiveCallsInSafeCallsEnd.kt")
    public void testConsecutiveCallsInSafeCallsEnd() throws Exception {
        runTest("idea/testData/indentationOnNewline/ConsecutiveCallsInSafeCallsEnd.kt");
    }

    @TestMetadata("Do2.kt")
    public void testDo2() throws Exception {
        runTest("idea/testData/indentationOnNewline/Do2.kt");
    }

    @TestMetadata("DoInFun.kt")
    public void testDoInFun() throws Exception {
        runTest("idea/testData/indentationOnNewline/DoInFun.kt");
    }

    @TestMetadata("DoWithBraces.kt")
    public void testDoWithBraces() throws Exception {
        runTest("idea/testData/indentationOnNewline/DoWithBraces.kt");
    }

    @TestMetadata("DoWithBraces2.kt")
    public void testDoWithBraces2() throws Exception {
        runTest("idea/testData/indentationOnNewline/DoWithBraces2.kt");
    }

    @TestMetadata("ElseIf.kt")
    public void testElseIf() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseIf.kt");
    }

    @TestMetadata("ElseInWhenWithOption.kt")
    public void testElseInWhenWithOption() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseInWhenWithOption.kt");
    }

    @TestMetadata("ElseInWhenWithoutOption.kt")
    public void testElseInWhenWithoutOption() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseInWhenWithoutOption.kt");
    }

    @TestMetadata("ElseWithBrace.kt")
    public void testElseWithBrace() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseWithBrace.kt");
    }

    @TestMetadata("ElseWithBraceAndComment.kt")
    public void testElseWithBraceAndComment() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseWithBraceAndComment.kt");
    }

    @TestMetadata("ElseWithBraceAndComment2.kt")
    public void testElseWithBraceAndComment2() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseWithBraceAndComment2.kt");
    }

    @TestMetadata("ElseWithoutBrace.kt")
    public void testElseWithoutBrace() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseWithoutBrace.kt");
    }

    @TestMetadata("ElseWithoutBrace2.kt")
    public void testElseWithoutBrace2() throws Exception {
        runTest("idea/testData/indentationOnNewline/ElseWithoutBrace2.kt");
    }

    @TestMetadata("EmptyParameters.kt")
    public void testEmptyParameters() throws Exception {
        runTest("idea/testData/indentationOnNewline/EmptyParameters.kt");
    }

    @TestMetadata("Finally.kt")
    public void testFinally() throws Exception {
        runTest("idea/testData/indentationOnNewline/Finally.kt");
    }

    @TestMetadata("Finally2.kt")
    public void testFinally2() throws Exception {
        runTest("idea/testData/indentationOnNewline/Finally2.kt");
    }

    @TestMetadata("Finally3.kt")
    public void testFinally3() throws Exception {
        runTest("idea/testData/indentationOnNewline/Finally3.kt");
    }

    @TestMetadata("For.kt")
    public void testFor() throws Exception {
        runTest("idea/testData/indentationOnNewline/For.kt");
    }

    @TestMetadata("ForWithBlock.kt")
    public void testForWithBlock() throws Exception {
        runTest("idea/testData/indentationOnNewline/ForWithBlock.kt");
    }

    @TestMetadata("ForWithCondition.kt")
    public void testForWithCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/ForWithCondition.kt");
    }

    @TestMetadata("ForWithoutCondition.kt")
    public void testForWithoutCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/ForWithoutCondition.kt");
    }

    @TestMetadata("FunctionBlock.kt")
    public void testFunctionBlock() throws Exception {
        runTest("idea/testData/indentationOnNewline/FunctionBlock.kt");
    }

    @TestMetadata("FunctionWithInference.kt")
    public void testFunctionWithInference() throws Exception {
        runTest("idea/testData/indentationOnNewline/FunctionWithInference.kt");
    }

    @TestMetadata("If.kt")
    public void testIf() throws Exception {
        runTest("idea/testData/indentationOnNewline/If.kt");
    }

    @TestMetadata("IfBeforeCondition.kt")
    public void testIfBeforeCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/IfBeforeCondition.kt");
    }

    @TestMetadata("IfBeforeCondition2.kt")
    public void testIfBeforeCondition2() throws Exception {
        runTest("idea/testData/indentationOnNewline/IfBeforeCondition2.kt");
    }

    @TestMetadata("IfBeforeCondition3.kt")
    public void testIfBeforeCondition3() throws Exception {
        runTest("idea/testData/indentationOnNewline/IfBeforeCondition3.kt");
    }

    @TestMetadata("IfBeforeCondition4.kt")
    public void testIfBeforeCondition4() throws Exception {
        runTest("idea/testData/indentationOnNewline/IfBeforeCondition4.kt");
    }

    @TestMetadata("IfWithBraces.kt")
    public void testIfWithBraces() throws Exception {
        runTest("idea/testData/indentationOnNewline/IfWithBraces.kt");
    }

    @TestMetadata("IfWithBraces2.kt")
    public void testIfWithBraces2() throws Exception {
        runTest("idea/testData/indentationOnNewline/IfWithBraces2.kt");
    }

    @TestMetadata("InBinaryExpressionInMiddle.kt")
    public void testInBinaryExpressionInMiddle() throws Exception {
        runTest("idea/testData/indentationOnNewline/InBinaryExpressionInMiddle.kt");
    }

    @TestMetadata("InBinaryExpressionUnfinished.kt")
    public void testInBinaryExpressionUnfinished() throws Exception {
        runTest("idea/testData/indentationOnNewline/InBinaryExpressionUnfinished.kt");
    }

    @TestMetadata("InBinaryExpressionUnfinishedInIf.kt")
    public void testInBinaryExpressionUnfinishedInIf() throws Exception {
        runTest("idea/testData/indentationOnNewline/InBinaryExpressionUnfinishedInIf.kt");
    }

    @TestMetadata("InBinaryExpressionsBeforeCloseParenthesis.kt")
    public void testInBinaryExpressionsBeforeCloseParenthesis() throws Exception {
        runTest("idea/testData/indentationOnNewline/InBinaryExpressionsBeforeCloseParenthesis.kt");
    }

    @TestMetadata("InDelegationListAfterColon.kt")
    public void testInDelegationListAfterColon() throws Exception {
        runTest("idea/testData/indentationOnNewline/InDelegationListAfterColon.kt");
    }

    @TestMetadata("InDelegationListAfterComma.kt")
    public void testInDelegationListAfterComma() throws Exception {
        runTest("idea/testData/indentationOnNewline/InDelegationListAfterComma.kt");
    }

    @TestMetadata("InDelegationListNotEmpty.kt")
    public void testInDelegationListNotEmpty() throws Exception {
        runTest("idea/testData/indentationOnNewline/InDelegationListNotEmpty.kt");
    }

    @TestMetadata("InEnumAfterSemicolon.kt")
    public void testInEnumAfterSemicolon() throws Exception {
        runTest("idea/testData/indentationOnNewline/InEnumAfterSemicolon.kt");
    }

    @TestMetadata("InEnumInitializerListAfterComma.kt")
    public void testInEnumInitializerListAfterComma() throws Exception {
        runTest("idea/testData/indentationOnNewline/InEnumInitializerListAfterComma.kt");
    }

    @TestMetadata("InEnumInitializerListNotEmpty.kt")
    public void testInEnumInitializerListNotEmpty() throws Exception {
        runTest("idea/testData/indentationOnNewline/InEnumInitializerListNotEmpty.kt");
    }

    @TestMetadata("InExpressionsParentheses.kt")
    public void testInExpressionsParentheses() throws Exception {
        runTest("idea/testData/indentationOnNewline/InExpressionsParentheses.kt");
    }

    @TestMetadata("InExpressionsParentheses2.kt")
    public void testInExpressionsParentheses2() throws Exception {
        runTest("idea/testData/indentationOnNewline/InExpressionsParentheses2.kt");
    }

    @TestMetadata("InExpressionsParentheses3.kt")
    public void testInExpressionsParentheses3() throws Exception {
        runTest("idea/testData/indentationOnNewline/InExpressionsParentheses3.kt");
    }

    @TestMetadata("InExpressionsParentheses4.kt")
    public void testInExpressionsParentheses4() throws Exception {
        runTest("idea/testData/indentationOnNewline/InExpressionsParentheses4.kt");
    }

    @TestMetadata("InExpressionsParenthesesBeforeOperand.kt")
    public void testInExpressionsParenthesesBeforeOperand() throws Exception {
        runTest("idea/testData/indentationOnNewline/InExpressionsParenthesesBeforeOperand.kt");
    }

    @TestMetadata("InLabmdaAfterArrow.kt")
    public void testInLabmdaAfterArrow() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLabmdaAfterArrow.kt");
    }

    @TestMetadata("InLambdaAfterArrowWithSpaces.kt")
    public void testInLambdaAfterArrowWithSpaces() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLambdaAfterArrowWithSpaces.kt");
    }

    @TestMetadata("InLambdaBeforeParams.kt")
    public void testInLambdaBeforeParams() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLambdaBeforeParams.kt");
    }

    @TestMetadata("InLambdaInsideChainCallSameLine.kt")
    public void testInLambdaInsideChainCallSameLine() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallSameLine.kt");
    }

    @TestMetadata("InLambdaInsideChainCallSameLineWithSpaces.kt")
    public void testInLambdaInsideChainCallSameLineWithSpaces() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallSameLineWithSpaces.kt");
    }

    @TestMetadata("InLambdaInsideChainCallWithNewLine.kt")
    public void testInLambdaInsideChainCallWithNewLine() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallWithNewLine.kt");
    }

    @TestMetadata("InLambdaInsideChainCallWithNewLineWithSpaces.kt")
    public void testInLambdaInsideChainCallWithNewLineWithSpaces() throws Exception {
        runTest("idea/testData/indentationOnNewline/InLambdaInsideChainCallWithNewLineWithSpaces.kt");
    }

    @TestMetadata("InMultilineLambdaAfterArrow.kt")
    public void testInMultilineLambdaAfterArrow() throws Exception {
        runTest("idea/testData/indentationOnNewline/InMultilineLambdaAfterArrow.kt");
    }

    @TestMetadata("IsExpressionAfterIs.kt")
    public void testIsExpressionAfterIs() throws Exception {
        runTest("idea/testData/indentationOnNewline/IsExpressionAfterIs.kt");
    }

    @TestMetadata("KT20783.kt")
    public void testKT20783() throws Exception {
        runTest("idea/testData/indentationOnNewline/KT20783.kt");
    }

    @TestMetadata("LargeFile.kt")
    public void testLargeFile() throws Exception {
        runTest("idea/testData/indentationOnNewline/LargeFile.kt");
    }

    @TestMetadata("LargeFileWithStringTemplate.kt")
    public void testLargeFileWithStringTemplate() throws Exception {
        runTest("idea/testData/indentationOnNewline/LargeFileWithStringTemplate.kt");
    }

    @TestMetadata("ModifierListInUnfinishedDeclaration.kt")
    public void testModifierListInUnfinishedDeclaration() throws Exception {
        runTest("idea/testData/indentationOnNewline/ModifierListInUnfinishedDeclaration.kt");
    }

    @TestMetadata("MultideclarationAfterEq.kt")
    public void testMultideclarationAfterEq() throws Exception {
        runTest("idea/testData/indentationOnNewline/MultideclarationAfterEq.kt");
    }

    @TestMetadata("MultideclarationBeforeEq.kt")
    public void testMultideclarationBeforeEq() throws Exception {
        runTest("idea/testData/indentationOnNewline/MultideclarationBeforeEq.kt");
    }

    @TestMetadata("NotFirstParameter.kt")
    public void testNotFirstParameter() throws Exception {
        runTest("idea/testData/indentationOnNewline/NotFirstParameter.kt");
    }

    @TestMetadata("PropertyWithInference.kt")
    public void testPropertyWithInference() throws Exception {
        runTest("idea/testData/indentationOnNewline/PropertyWithInference.kt");
    }

    @TestMetadata("ReturnContinue.kt")
    public void testReturnContinue() throws Exception {
        runTest("idea/testData/indentationOnNewline/ReturnContinue.kt");
    }

    @TestMetadata("Semicolon.kt")
    public void testSemicolon() throws Exception {
        runTest("idea/testData/indentationOnNewline/Semicolon.kt");
    }

    @TestMetadata("Semicolon2.kt")
    public void testSemicolon2() throws Exception {
        runTest("idea/testData/indentationOnNewline/Semicolon2.kt");
    }

    @TestMetadata("SettingAlignMultilineParametersInCalls.kt")
    public void testSettingAlignMultilineParametersInCalls() throws Exception {
        runTest("idea/testData/indentationOnNewline/SettingAlignMultilineParametersInCalls.kt");
    }

    @TestMetadata("TemplateEntryClose.kt")
    public void testTemplateEntryClose() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose.kt");
    }

    @TestMetadata("TemplateEntryClose2.kt")
    public void testTemplateEntryClose2() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose2.kt");
    }

    @TestMetadata("TemplateEntryClose3.kt")
    public void testTemplateEntryClose3() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose3.kt");
    }

    @TestMetadata("TemplateEntryClose4.kt")
    public void testTemplateEntryClose4() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose4.kt");
    }

    @TestMetadata("TemplateEntryClose5.kt")
    public void testTemplateEntryClose5() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose5.kt");
    }

    @TestMetadata("TemplateEntryClose6.kt")
    public void testTemplateEntryClose6() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose6.kt");
    }

    @TestMetadata("TemplateEntryClose7.kt")
    public void testTemplateEntryClose7() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryClose7.kt");
    }

    @TestMetadata("TemplateEntryCloseInMultilineString.kt")
    public void testTemplateEntryCloseInMultilineString() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryCloseInMultilineString.kt");
    }

    @TestMetadata("TemplateEntryCloseInMultilineString2.kt")
    public void testTemplateEntryCloseInMultilineString2() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryCloseInMultilineString2.kt");
    }

    @TestMetadata("TemplateEntryCloseInMultilineString3.kt")
    public void testTemplateEntryCloseInMultilineString3() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryCloseInMultilineString3.kt");
    }

    @TestMetadata("TemplateEntryOpen.kt")
    public void testTemplateEntryOpen() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpen.kt");
    }

    @TestMetadata("TemplateEntryOpen2.kt")
    public void testTemplateEntryOpen2() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpen2.kt");
    }

    @TestMetadata("TemplateEntryOpenInMultilineString.kt")
    public void testTemplateEntryOpenInMultilineString() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenInMultilineString.kt");
    }

    @TestMetadata("TemplateEntryOpenInMultilineString2.kt")
    public void testTemplateEntryOpenInMultilineString2() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenInMultilineString2.kt");
    }

    @TestMetadata("TemplateEntryOpenInMultilineString3.kt")
    public void testTemplateEntryOpenInMultilineString3() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenInMultilineString3.kt");
    }

    @TestMetadata("TemplateEntryOpenWithComment.kt")
    public void testTemplateEntryOpenWithComment() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithComment.kt");
    }

    @TestMetadata("TemplateEntryOpenWithComment2.kt")
    public void testTemplateEntryOpenWithComment2() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithComment2.kt");
    }

    @TestMetadata("TemplateEntryOpenWithoutContent.kt")
    public void testTemplateEntryOpenWithoutContent() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithoutContent.kt");
    }

    @TestMetadata("TemplateEntryOpenWithoutContent2.kt")
    public void testTemplateEntryOpenWithoutContent2() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithoutContent2.kt");
    }

    @TestMetadata("TemplateEntryOpenWithoutContent3.kt")
    public void testTemplateEntryOpenWithoutContent3() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithoutContent3.kt");
    }

    @TestMetadata("TemplateEntryOpenWithoutContent4.kt")
    public void testTemplateEntryOpenWithoutContent4() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithoutContent4.kt");
    }

    @TestMetadata("TemplateEntryOpenWithoutContent5.kt")
    public void testTemplateEntryOpenWithoutContent5() throws Exception {
        runTest("idea/testData/indentationOnNewline/TemplateEntryOpenWithoutContent5.kt");
    }

    @TestMetadata("Try.kt")
    public void testTry() throws Exception {
        runTest("idea/testData/indentationOnNewline/Try.kt");
    }

    @TestMetadata("Try2.kt")
    public void testTry2() throws Exception {
        runTest("idea/testData/indentationOnNewline/Try2.kt");
    }

    @TestMetadata("WhenWithCondition.kt")
    public void testWhenWithCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/WhenWithCondition.kt");
    }

    @TestMetadata("WhenWithCondition2.kt")
    public void testWhenWithCondition2() throws Exception {
        runTest("idea/testData/indentationOnNewline/WhenWithCondition2.kt");
    }

    @TestMetadata("WhenWithoutCondition.kt")
    public void testWhenWithoutCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/WhenWithoutCondition.kt");
    }

    @TestMetadata("While.kt")
    public void testWhile() throws Exception {
        runTest("idea/testData/indentationOnNewline/While.kt");
    }

    @TestMetadata("While2.kt")
    public void testWhile2() throws Exception {
        runTest("idea/testData/indentationOnNewline/While2.kt");
    }

    @TestMetadata("While3.kt")
    public void testWhile3() throws Exception {
        runTest("idea/testData/indentationOnNewline/While3.kt");
    }

    @TestMetadata("WhileWithBlock.kt")
    public void testWhileWithBlock() throws Exception {
        runTest("idea/testData/indentationOnNewline/WhileWithBlock.kt");
    }

    @TestMetadata("WhileWithCondition.kt")
    public void testWhileWithCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/WhileWithCondition.kt");
    }

    @TestMetadata("WhileWithoutCondition.kt")
    public void testWhileWithoutCondition() throws Exception {
        runTest("idea/testData/indentationOnNewline/WhileWithoutCondition.kt");
    }

    @TestMetadata("idea/testData/indentationOnNewline/script")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Script extends AbstractPerformanceTypingIndentationTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doPerfTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInScript() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/indentationOnNewline/script"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("ScriptAfterClosingBrace.kts")
        public void testScriptAfterClosingBrace() throws Exception {
            runTest("idea/testData/indentationOnNewline/script/ScriptAfterClosingBrace.kts");
        }

        @TestMetadata("ScriptAfterExpression.kts")
        public void testScriptAfterExpression() throws Exception {
            runTest("idea/testData/indentationOnNewline/script/ScriptAfterExpression.kts");
        }

        @TestMetadata("ScriptAfterFun.kts")
        public void testScriptAfterFun() throws Exception {
            runTest("idea/testData/indentationOnNewline/script/ScriptAfterFun.kts");
        }

        @TestMetadata("ScriptAfterImport.kts")
        public void testScriptAfterImport() throws Exception {
            runTest("idea/testData/indentationOnNewline/script/ScriptAfterImport.kts");
        }

        @TestMetadata("ScriptBetweenFunctionCalls.kts")
        public void testScriptBetweenFunctionCalls() throws Exception {
            runTest("idea/testData/indentationOnNewline/script/ScriptBetweenFunctionCalls.kts");
        }

        @TestMetadata("ScriptInsideFun.kts")
        public void testScriptInsideFun() throws Exception {
            runTest("idea/testData/indentationOnNewline/script/ScriptInsideFun.kts");
        }
    }
}
