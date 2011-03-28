A BDD Starter App
======
**Requires** [Gradle][gradle] (0.9+) to build/run.   

Offers a sample cucumber feature file with step definitions coded in Groovy.    
Stub created for writing step definitions in Java instead.   

First time only
===
 * gradle -i installGems test   
 
Subsequent times
===
 * gradle -i test
 * gradle -i cucumber     (Same thing as test)
 * gradle -i cucumberWip  (Only runs features labeled as work-in-progress) 
 * Browse to build/test-results/cucumber/report.html

Feature file tricks
===
 * Put **@ignore** at the top of any feature file to ignore it in the cucumber suite.
 * Put **@wip** and cucumberWip task only runs features files labeled this way.
 
[gradle]:http://gradle.org/