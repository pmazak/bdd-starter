A BDD Starter App
======
**Requires** [Gradle][gradle] (0.9+) to build/run.   

Creates a blank project with sample [Cucumber][cucumber] tests.  This is ready to go as a standalone app to BDD-test your real app.  
Uses [cuke4duke][cuke4duke] so the step definitions are in Groovy/Java.  

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
 * Put **@wip** and the cucumberWip task only runs features files labeled this way.
 
[gradle]:http://gradle.org/
[cucumber]:http://cukes.info/
[cuke4duke]:https://github.com/aslakhellesoy/cuke4duke/wiki