echo Begin Build
mkdir out
kotlinc -d out/aaa.jar -include-runtime src
echo End Build