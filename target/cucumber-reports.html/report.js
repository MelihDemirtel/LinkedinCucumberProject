$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/TextBox.feature");
formatter.feature({
  "name": "TextBox",
  "description": "  As a user\n  I want to submit information form\n  So that I can write my information",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Submit to information of user",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "error_message": "org.openqa.selenium.remote.http.ConnectionFailedException: Unable to establish websocket connection to http://localhost:61472/devtools/browser/da152181-4333-41a3-bfcb-f300139e68dd\nBuild info: version: \u00274.6.0\u0027, revision: \u002779f1c02ae20\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.12\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat org.openqa.selenium.remote.http.netty.NettyWebSocket.\u003cinit\u003e(NettyWebSocket.java:102)\r\n\tat org.openqa.selenium.remote.http.netty.NettyWebSocket.lambda$create$3(NettyWebSocket.java:128)\r\n\tat org.openqa.selenium.remote.http.netty.NettyClient.openSocket(NettyClient.java:107)\r\n\tat org.openqa.selenium.devtools.Connection.\u003cinit\u003e(Connection.java:77)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.lambda$new$2(ChromiumDriver.java:116)\r\n\tat java.base/java.util.Optional.map(Optional.java:265)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.\u003cinit\u003e(ChromiumDriver.java:114)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:81)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:49)\r\n\tat utils.DriverUtils.initialize_Driver(DriverUtils.java:21)\r\n\tat utils.Hooks.before(Hooks.java:16)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:42)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:69)\r\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:24)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the demoqa home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.iAmOnTheDemoqaHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click elements page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.userClickElementsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click text box page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickTextBoxPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user write full name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteFullName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user write email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteEmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user write current address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteCurrentAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click submit",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.userClickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user check information",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.Hooks.after(Hooks.java:20)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:69)\r\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:24)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
});