# COUNT WORDS APPS
a simple java cli application to solve some requirements :
- count how many given words that started with 'M'/'m'
- print word that have more than 5 character in the given words

## Run
### using docker
build the docker image :
```
docker image build -t inout-count-words:latest .
```

run the image with params words :
```
docker run inout-count-words:latest word1 word2 word3
```
or like :
```
docker run inout-count-words:latest apple Banana Manggo marble
```

### without docker
make sure maven already installed.
build jar :
```
mvn clean package
```

run the jar with param :
```
java -jar target/countwords-1.0.jar word1 word2 word3
```


## Project structures
Main structure is consisted of 
- interfaces : provided the interfaces that will be used
- services : provided all the feature needed like the 
  - handler : handling the data communication rest, primitive, grp, /etc. 
  - model : classes that will represent data. 
  - repository : anything that related to databases.
  - service : core of the service.
- utils : provided general / utility / helper code that will re-used by many services

the test file is located src/test with same namespace as Main