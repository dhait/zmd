# Test of the markdown processor.

This is a test of the markdown processor.

## Some code

Here is some code.



```Z eval=false
schema Abc 
   x : nat
where
   x geq 3
end
```

Now we will create a new section.  We need to explicitly
add the *standard_toolkit* as a parent:

```Z eval=false
section mysection parents standard_toolkit end
```

And some more code:

```Z eval=false
zed
  WORD == 0 upto 255
end
```

```Z eval=false
axiom
  mem_size : WORD
where
  mem_size = 100
end
```