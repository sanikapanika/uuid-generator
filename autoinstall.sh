javac UuidGenerator.java
mkdir -p /usr/local/lib/uuid
cp UuidGenerator.class /usr/local/lib/uuid
rm /usr/local/bin/uuid
echo "java --class-path=/usr/local/lib/uuid UuidGenerator" >> /usr/local/bin/uuid
chmod a+x /usr/local/bin/uuid
