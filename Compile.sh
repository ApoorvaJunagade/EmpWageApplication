#! /bin/bash
function CompileJavafile()
{
       javac -d ./classes/ -cp ./classes/ $1
}
for file in `find ./ -type f -name "*.java"`
do echo $file
$(CompileJavafile $file)
done
