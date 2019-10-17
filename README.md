# Spring Boot - Dynamic Loading Jar Example

This project consists of "3" mini projects


```
commons
app
defaultSystemAdapter
```

The first is `commons` which defines the `SystemAdapter` protocol and an enum of `SystemAdapter` type

`defaultSystemAdapter` includes a few "implementations" of the `SystemAdapter`

Our Application `app` is the main application and it includes a single `NullSystemAdapater` which is a default stand-in system adapter so it will compile.


the `run.sh` will build all 3 `jar` files.  

It will then run the system twice.  Once with just the application and it will report:

>
>-------SYSTEM ADAPTERS ------
>
>...Loaded Class: class org.company.adapters.NullAdapter of type: NULL
>
>-------------------------------
>

Next it will run it with `-Dloader.path=file:./defaultImplementation/build/libs/defaultImplementati
       │ on-0.0.1-SNAPSHOT.jar`

which tells SpringBoot (using the PropertiesLauncher) to add this additional jar to the runtime this time detecting the additional SystemAdapters

> -------SYSTEM ADAPTERS ------
> 
> ...Loaded Class: class org.company.adapters.DefaultTurkeyAdapter of type: Turkey
> ...Loaded Class: class org.company.adapters.TacoTruckAdapter of type: Taco
> ...Loaded Class: class org.company.adapters.NullAdapter of type: NULL
> 
> -------------------------------
