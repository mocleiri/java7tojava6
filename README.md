java7tojava6
============

A Proof of Concept to show that using the eclipse compiler we can compile java 7 compatible source into java 6 compatible class files.

mvn clean install using the java 7 compiler (maven will switch to the eclipse compiler)

Then run using the java 6 compiler to verify:

/c/Program\ Files/Java/jdk1.6.0_31/jre/bin/java -cp target/javac-examples-0.0.1-SNAPSHOT.jar  org.kuali.student.javac.Java7CompatibleCode
