#! /bin/bash 

for file in `find ./ -type f -name "*.class"`
do   	
        	
  	f1=`echo $file`
         echo $f1
	
done
	 java -cp ./classes/ com/Employeewage/controller/$1




