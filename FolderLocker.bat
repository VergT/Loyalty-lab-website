c/s

@ECHO OFF

title Folder Locker

if EXIST "Control Panel.{21EC20203AEA-1069-A2DD-08002B30309D}" goto UNLOCK

if NOTEXIST Locker goto MDLOCKER

:CONFIRM

echo Are you sure u want to lock the folder(Y/N)

set/p "cho=>"

if %cho%==Y goto LOCK

if %cho%==y goto LOCK

if %cho%==n goto END

if %cho%==N goto END

echo invalid choice

goto CONFIRM

:LOCK

ren Locker "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}"

attrib +h +s "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}"

echo Folder locked

goto END

:UNLOCK

echo ENTER password to Unlock folder

set/p "pass=>"

if NOT %pass%==vergtrapking goto FAIL

attrib -h -s "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}"

ren  "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}" Locker

echo Folder Unlocked successfully

goto End

:FAIL

echo Invalid password

goto end

:MDLOCKER

md Locker

echo Locker created successfully

goto End

:End







