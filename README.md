## simple-uuid-generator

Generate uuids by typing `uuid` in terminal

## Setup
If the repo is updated, just redo the steps below.

## Prerequisites
- Java 11
- Maven

### Auto
1. Clone the repo or pull master
2. Run `sudo bash autoinstall.sh`

### Manual
1. Clone the repo
2. Open a terminal and type `mvn clean package` in the project root
3. Copy the generated `target/uuid-generator-1.0.0.jar` to anywhere, just copy the path you put it in (you can leave it where it is just get the path with `pwd`)
4. Navigate to `/usr/local/bin`
5. Create a file named uuid there (`sudo nano uuid` or `sudo vim uuid`)
6. Paste the script below
7. Finally type `sudo chmod a+x uuid`

Script:
```shell script
#!/usr/bin/env bash

java -jar /usr/local/lib/uuid/uuid-generator-1.0.0.jar $@
``` 

## Usage
```shell script
$ uuid

$ uuid -n4 <==> uuid --number=4

$ uuid -n2 -nd <==> uuid -n2 --no-dashes
(generate 2 uuid4 strings without dashes)

$ uuid -n3 -nd -cl <==> uuid -n3 -nd --case=l
(generate 3 uuid4 strings without dashes in lowercase letters, -cu/--case=u for uppercase)
```
