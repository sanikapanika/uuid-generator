javac UuidGenerator.java
mkdir -p /usr/local/lib/uuid
cp UuidGenerator.class /usr/local/lib/uuid
if [ -e /usr/local/bin/uuid ]
then 
	rm /usr/local/bin/uuid
fi
echo 'java --class-path=/usr/local/lib/uuid UuidGenerator $1' >> /usr/local/bin/uuid
chmod a+x /usr/local/bin/uuid
