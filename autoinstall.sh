mvn clean package
mkdir -p /usr/local/lib/uuid
cp target/uuid-generator-1.0.0.jar /usr/local/lib/uuid/uuid-generator-1.0.0.jar
if [ -e /usr/local/bin/uuid ]
then 
	rm /usr/local/bin/uuid
fi
echo 'java -jar /usr/local/lib/uuid/uuid-generator-1.0.0.jar $@' >> /usr/local/bin/uuid
chmod a+x /usr/local/bin/uuid
