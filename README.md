##### Getting started

After cloning this repository, verify that things work by running

```bash
./gradlew :runMain
```

Expected output (after solving the puzzles) is
```txt
> Task :runMain
this is a secret string from Public Library
ExposedLibrary
static ExposedLibrary
Implementation 2
Exception in thread "main" java.lang.NoSuchMethodError: RuntimeImpl.compileMethod()Ljava/lang/String;
        at Main.main(Main.java:22)
```
