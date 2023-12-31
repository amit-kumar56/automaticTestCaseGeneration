/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Aug 24 19:10:20 GMT 2023
 */

package com.example.Amit.exception;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SectorControllerExceptionHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.example.Amit.exception.SectorControllerExceptionHandler"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "IN"); 
    java.lang.System.setProperty("user.dir", "/home/amit/Downloads/stock-market-charting-application-SectorServiceApp"); 
    java.lang.System.setProperty("user.home", "/home/amit"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "amit"); 
    java.lang.System.setProperty("user.timezone", "Asia/Kolkata"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SectorControllerExceptionHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.web.bind.annotation.ControllerAdvice",
      "com.example.Amit.exception.SectorNotFoundException",
      "org.springframework.http.HttpHeaders",
      "org.springframework.http.ResponseEntity$DefaultBuilder",
      "org.springframework.util.LinkedCaseInsensitiveMap",
      "org.springframework.http.HttpStatus$Series",
      "org.springframework.util.MultiValueMap",
      "com.example.Amit.exception.ErrorResponse",
      "org.springframework.http.ResponseEntity$BodyBuilder",
      "org.springframework.http.ReadOnlyHttpHeaders",
      "org.springframework.util.LinkedCaseInsensitiveMap$EntrySet",
      "com.example.Amit.exception.SectorControllerExceptionHandler",
      "org.springframework.util.MultiValueMapAdapter",
      "org.springframework.util.LinkedCaseInsensitiveMap$1",
      "org.springframework.http.HttpStatus",
      "org.springframework.http.HttpEntity",
      "org.springframework.stereotype.Component",
      "org.springframework.util.CollectionUtils",
      "org.springframework.http.ResponseEntity",
      "org.springframework.http.ResponseEntity$HeadersBuilder",
      "org.springframework.util.LinkedMultiValueMap",
      "org.springframework.util.Assert"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SectorControllerExceptionHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.example.Amit.exception.SectorControllerExceptionHandler",
      "org.springframework.http.HttpStatus$Series",
      "org.springframework.http.HttpStatus",
      "com.example.Amit.exception.SectorNotFoundException",
      "com.example.Amit.exception.ErrorResponse",
      "org.springframework.http.ReadOnlyHttpHeaders",
      "org.springframework.util.MultiValueMapAdapter",
      "org.springframework.util.LinkedMultiValueMap",
      "org.springframework.util.Assert",
      "org.springframework.http.HttpHeaders",
      "org.springframework.util.LinkedCaseInsensitiveMap",
      "org.springframework.util.LinkedCaseInsensitiveMap$1",
      "org.springframework.util.CollectionUtils",
      "org.springframework.http.HttpEntity",
      "org.springframework.http.ResponseEntity",
      "org.springframework.http.ResponseEntity$DefaultBuilder",
      "org.springframework.util.LinkedCaseInsensitiveMap$EntrySet"
    );
  }
}
