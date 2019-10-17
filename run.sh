#!/bin/sh

# Build the app
gradle :app:bootJar

# Build the Library
cd defaultImplementation
gradle jar
cd ..

# Run normal mode
java -jar -jar app/build/libs/app-0.0.1-SNAPSHOT.jar


# Run with additional file
#Debug Mode
#java -Dloader.path=file:./defaultImplementation/build/libs/defaultImplementation-0.0.1-SNAPSHOT.jar -Dloader.debug=true -jar app/build/libs/app-0.0.1-SNAPSHOT.jar
java -Dloader.path=file:./defaultImplementation/build/libs/defaultImplementation-0.0.1-SNAPSHOT.jar -Dloader.debug=false -jar app/build/libs/app-0.0.1-SNAPSHOT.jar


