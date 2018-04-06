/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.android.synthetic.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class AndroidBytecodeShapeTestGenerated extends AbstractAndroidBytecodeShapeTest {
    @TestMetadata("activityWithEntityOptionsNoCache")
    public void testActivityWithEntityOptionsNoCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/activityWithEntityOptionsNoCache/");
        doTest(fileName);
    }

    public void testAllFilesPresentInBytecodeShape() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("baseClass")
    public void testBaseClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/baseClass/");
        doTest(fileName);
    }

    @TestMetadata("baseClassFragment")
    public void testBaseClassFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/baseClassFragment/");
        doTest(fileName);
    }

    @TestMetadata("clearCache")
    public void testClearCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/clearCache/");
        doTest(fileName);
    }

    @TestMetadata("clearCacheBaseClass")
    public void testClearCacheBaseClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/clearCacheBaseClass/");
        doTest(fileName);
    }

    @TestMetadata("dialog")
    public void testDialog() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/dialog/");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctions")
    public void testExtensionFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/extensionFunctions/");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctionsFragment")
    public void testExtensionFunctionsFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/extensionFunctionsFragment/");
        doTest(fileName);
    }

    @TestMetadata("extensionFunctionsView")
    public void testExtensionFunctionsView() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/extensionFunctionsView/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInAttr")
    public void testFqNameInAttr() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInAttr/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInAttrFragment")
    public void testFqNameInAttrFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInAttrFragment/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTag")
    public void testFqNameInTag() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInTag/");
        doTest(fileName);
    }

    @TestMetadata("fqNameInTagFragment")
    public void testFqNameInTagFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fqNameInTagFragment/");
        doTest(fileName);
    }

    @TestMetadata("fragmentWithEntityOptionsNoCache")
    public void testFragmentWithEntityOptionsNoCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/fragmentWithEntityOptionsNoCache/");
        doTest(fileName);
    }

    @TestMetadata("kt18545")
    public void testKt18545() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/kt18545/");
        doTest(fileName);
    }

    @TestMetadata("multiFile")
    public void testMultiFile() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/multiFile/");
        doTest(fileName);
    }

    @TestMetadata("multiFileFragment")
    public void testMultiFileFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/multiFileFragment/");
        doTest(fileName);
    }

    @TestMetadata("onDestroyFragment")
    public void testOnDestroyFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/onDestroyFragment/");
        doTest(fileName);
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simple/");
        doTest(fileName);
    }

    @TestMetadata("simpleFragment")
    public void testSimpleFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleFragment/");
        doTest(fileName);
    }

    @TestMetadata("simpleFragmentProperty")
    public void testSimpleFragmentProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleFragmentProperty/");
        doTest(fileName);
    }

    @TestMetadata("simpleHashMapCacheImplementation")
    public void testSimpleHashMapCacheImplementation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleHashMapCacheImplementation/");
        doTest(fileName);
    }

    @TestMetadata("simpleView")
    public void testSimpleView() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/simpleView/");
        doTest(fileName);
    }

    @TestMetadata("supportExtensionFunctionsFragment")
    public void testSupportExtensionFunctionsFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportExtensionFunctionsFragment/");
        doTest(fileName);
    }

    @TestMetadata("supportExtensionFunctionsFragmentAndroidx")
    public void testSupportExtensionFunctionsFragmentAndroidx() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportExtensionFunctionsFragmentAndroidx/");
        doTest(fileName);
    }

    @TestMetadata("supportSimpleFragment")
    public void testSupportSimpleFragment() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragment/");
        doTest(fileName);
    }

    @TestMetadata("supportSimpleFragmentAndroidx")
    public void testSupportSimpleFragmentAndroidx() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragmentAndroidx/");
        doTest(fileName);
    }

    @TestMetadata("supportSimpleFragmentProperty")
    public void testSupportSimpleFragmentProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragmentProperty/");
        doTest(fileName);
    }

    @TestMetadata("supportSimpleFragmentPropertyAndroidx")
    public void testSupportSimpleFragmentPropertyAndroidx() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/supportSimpleFragmentPropertyAndroidx/");
        doTest(fileName);
    }

    @TestMetadata("viewStub")
    public void testViewStub() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewStub/");
        doTest(fileName);
    }

    @TestMetadata("viewWithCache")
    public void testViewWithCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewWithCache/");
        doTest(fileName);
    }

    @TestMetadata("viewWithDefaultNoCache")
    public void testViewWithDefaultNoCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewWithDefaultNoCache/");
        doTest(fileName);
    }

    @TestMetadata("viewWithEntityOptionsNoCache")
    public void testViewWithEntityOptionsNoCache() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/android-extensions/android-extensions-compiler/testData/codegen/bytecodeShape/viewWithEntityOptionsNoCache/");
        doTest(fileName);
    }
}
