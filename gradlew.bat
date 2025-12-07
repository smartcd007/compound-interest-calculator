@ECHO OFF
SETLOCAL
IF NOT DEFINED JAVA_HOME (
  ECHO WARNING: JAVA_HOME is not set. Gradle may not run without a JDK.
)
set PRG=%~dp0
set DIR=%PRG:~0,-1%
"%DIR%\gradle\wrapper\gradle-wrapper.jar" %*
