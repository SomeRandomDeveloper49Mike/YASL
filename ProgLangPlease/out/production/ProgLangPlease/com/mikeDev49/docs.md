# Getting sterted with YASL
So, YASL is Yet Another Stack Language. Every program (for now) has its own stack. Example Program in YASL:
```yasl
INIT
PUSHCHAR 72
PUSHCHAR 73
FLUSHSTACK
EXIT
```
First line is `INIT` command, which initializes stack. On the next line you can see
`PUSHCHAR` command, that pushes (or adds) character 73 (ASCII: "H") onto the stack.
Then we add "I" (73) onto program's stack. Now we "flush" all values in stack to console.
So, first char is "H", so it gets displayed on console, then "I" and we get "HI" in 
the console as the final output. `EXIT` just properly exits program. 
So let's make another program:
```yasl
INIT
PUSHINT 49
PUSHINT 1
ADD
FLUSH
EXIT
```
Now, instead of `PUSHCHAR` command we use `PUSHINT`, which pushes an integer to stack
(surprise!). `ADD` command is, as its name suggests, adds two integers, and then pushes
result onto the stack. Then `FLUSH` command outputs last value to console. So, There are
other necessary commands that you must know: `COPY`, `PASTE`, `FLUSHBUFFER` and 
`POPBUFFER`. `COPY` just pushes last value to buffer. `FLUSHBUFFER` outputs value that 
is in buffer to console. `PASTE` pushes value in buffer to stack. `POPBUFFER` just clears
buffer.