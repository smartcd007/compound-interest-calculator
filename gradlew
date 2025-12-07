
#!/usr/bin/env sh
#!/bin/sh
# Gradle wrapper launcher

# Find the directory of this script
PRG="$0"
while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`"/$link"
  fi
done

PRGDIR=`dirname "$PRG"`
cd "$PRGDIR" || exit 1
DIR=`pwd -P`

WRAPPER_JAR="$DIR/gradle/wrapper/gradle-wrapper.jar"

if [ ! -f "$WRAPPER_JAR" ]; then
  echo "gradle-wrapper.jar not found in $WRAPPER_JAR"
  exit 1
fi

exec java -jar "$WRAPPER_JAR" "$@"

