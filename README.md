# Java Points-To Analysis for Soufflé

This repository contains a modified DOOP extractor and a modified points-to specifications for Soufflé.
Currently there are two points-to analyses implemented in form of logical specifications: context-insensitive with call-graph construction on the fly and context-sensitive (2-Heap + 1-Object). 

The extractor can be build by typing 

```
./gradlew build
```

The extractor can be invoked by typing 

```
java -jar build/lib/extractor.jar <program-to-analyse.jar> -lsystem -d <fact-dir>
```

where `<program-to-analyze.jar>` is the jar file for which the fact files are produced and `<fact-dir>` is the directory where the fact files are written to. 

To use an example from the `examples/` directory:

```
java -jar build/lib/extractor.jar examples/HelloWorld.jar -lsystem -d hello-facts
```

More information about DOOP can be found here:
http://doop.program-analysis.org/

The modified DOOP points-to analysis has been provided by Oracle Labs:
https://github.com/oracle/souffle/tree/master/samples

How to install and run the Soufflé can be found here:
http://github.com/souffle-lang/souffle

### Things Davis Did ###

* Upgraded Gradle Wrapper (you dont do anything for this)
* Use Jdk8 (make sure you use jdk8 for gradle and java commands!)
	* Compile the examples yourself (`/usr/lib/.../jdk8/bin/jar cf example.jar example.java`)
	* `JAVA_HOME=/usr/lib/jvm/jdk8u265-b01 ./gradlew build`
	* `/usr/lib/jvm/jdk8u265-b01/bin/java -jar build/libs/extractor.jar examples/HelloWorld.jar -lsystem -d hello-facts -allow-phantom`
* use `devlop` brach of soot, unreleased!!
    * I hand-compiled soots JAR. Didnt help as much as expected.
* RIGHT NOW PHANTOMS ARE REQUIRED TO BE ALLOWED
    * when you run the jar...  `java -jar ... -allow-phantom`. SORRY! IDK DONT BLAME DAVIS