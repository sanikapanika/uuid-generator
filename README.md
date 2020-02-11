## uuid-generator

Generate uuids by typing `uuid` in terminal

##Setup

1. Clone the repo
2. Open a terminal and type `javac UuidGenerator.java`
3. Copy the generated `UuidGenerator.class` to anywhere, just copy the path you put it in (you can leave it where it is just get the path with `pwd`)
4. Navigate to `/usr/local/bin`
5. Create a file named uuid there (`sudo nano uuid` or `sudo vim uuid`)
6. Paste the script below
7. Finally type `sudo chmod a+x uuid`

Script:
```shell script
#!/usr/bin/env bash

java --class-path=<UuidGenerator.class location> UuidGenerator
``` 

Type uuid in terminal and voila