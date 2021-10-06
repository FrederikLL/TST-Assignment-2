# Reflections

## Computer Mouse

Testing of a computer mouse:

Make sure each button works as intended.  

Make sure the buttons works as intended after a very high amount of clicks.

Make sure the cord/signal is long and strong enough.

Make sure it registers movement precisely and input as intended.

## Catastrophic failure

2 soldiers was killed in an incident involving military training because the software 
of an artillery tracking firing system would default altitude to 0 if no input was given of the
targets altitude.

This could have been avoiding in testing. The developers could have tested for no input 
in altitude(and distance) and demand an input before the gun would fire.

Probably also could have been avoided with some kind of verification of the target location before firing.

They must have tested for 0 inputs in all of those "locating" variables, because if they
are all 0, that would be the location of the gun(unless it uses geolocation).

# Two Katas

## String Utility

See code.  

## Bowling Game Kata

See code (I wasn't sure about what was expected in this task, so i basicly just followed the linked slides).

# Investigation Of Tools

## JUnit 5
Tags for JUnit 5:

@Tag : Tags and filters tests. For example, makes it possible to run tests only with similar tag. 

@Disabled : Disables a test, avoiding deletion. The test may prove useful again at a later time.  

@RepeatedTest : Repeats a test the specified number of times.  

@BeforeEach, @AfterEach : Each is a method that executes before/after each test.  

@BeforeAll, @AfterAll : Each is a method that executes before all test and after all test. 

@DisplayName : A custom name for the test to be displayed when it is run and shown in test reports. 

@Nested : Allows for a inner test class to group up several test classes under one parent. 

assumeFalse, assumeTrue : Assumes a statement to be true/false, and if it fails it will abort tests.

## Mocking Frameworks

# Mockito
Clear and simple syntax.  
Supported by Spring.  
Static method/constructor mocking achieved when paired with powermock.  
Low learning curve. 
Uses proxy API design architecture. 

# JMockit
Static method/constructor achieved directly in JMockit.  
Steep learning curve.  
Based on Java 1.5 instrumentation API framework.

I personally haven't used mocking a whole lot, but i used and will be using Mockito because it is what
i know and it seems to be the most understandable.  
