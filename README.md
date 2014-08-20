# camunda Call activity snippet unit Test

This is an example using the Call activity functionality of Camunda.

A dummy delegate is use to follow the execution of the process.
The expected test result in the console should be.
INFO: Processing resource Slave.bpmn
Aug 20, 2014 5:20:34 PM org.camunda.bpm.unittest.DummyDelegate1 execute
SEVERE: Delegate Slave
Aug 20, 2014 5:20:34 PM org.camunda.bpm.unittest.DummyDelegate execute
SEVERE: Delegate Master
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.797 sec


The test case have been done with the Camunda engune unit test template.

# camunda engine unit test template

This git repository contains a simple example of how to write a unit test for camunda bpm. You can use it for reporting bugs or asking questions in the forums.

The project contains the following files:

```
src/
├── main
│   ├── java
│   └── resources
└── test
    ├── java
    │   └── org
    │       └── camunda
    │           └── bpm
    │               └── unittest
    │                   └── SimpleTestCase.java   (1)
    └── resources
        ├── camunda.cfg.xml                       (2)
        └── testProcess.bpmn                      (3)
```
Explanation:

* (1) A java class containing a JUnit Test. It uses the `ProcessEngineRule` for bootstrapping the process engine.
* (2) Configuration file for the process engine.
* (3) An example BPMN process.

## Running the test with maven

In order to run the testsuite with maven you can say:

```
mvn clean test
```

## Importing the project into eclipse.

If you use eclipse you can simply import the project by selecting `File / Import |-> Existing Maven Projects.

