@echo off
setlocal

cd /d "%~dp0"
mvn jetty:run

endlocal