<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>This Test Suite collection will contain all the test cases of Chiragh front end. This will ensure that relase is stable</description>
   <name>ChiraghWeb_FrontEnd_AutomationScripts</name>
   <tag></tag>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>uat</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/ChiraghWeb_FrontEnd_Tests</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>uat</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/ChiraghWeb_FrontEnd_TopUps</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>uat</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/ChiraghWeb_FrontEnd_PropertySubmissionAndVerificaiton</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
