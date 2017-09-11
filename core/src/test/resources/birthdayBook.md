---
title: BirthdayBook
author: David J Hait
date: September 8, 2017
...

This is the BirthdayBook specification, from <cites><a href="#spivey1992">Spivey</a></cites>.  We extend it slightly by 
adding an extra operation, ***RemindOne***, that is non-deterministic.


```Z
section birthday_book parents standard_toolkit end
```

```Z
zed
    [ NAME, DATE ]
end
```

The **BirthdayBook** schema defines the *state space* of 
the birthday book system. 

```Z
schema BirthdayBook 
    known : \power NAME 
    birthday : NAME \pfun DATE
 where
    known = dom birthday
end
```

This **InitBirthdayBook** specifies the initial state
of the birthday book system.  It does not say explicitly that
*birthday* is empty, but that is implicit, because its domain
is empty.

```Z
schema InitBirthdayBook 
    BirthdayBook′ 
where
    known′ = { }
end
```

Next we have several operation schemas to define the normal (non-error)
behaviour of the system.

```Z
schema AddBirthday 
    \Delta BirthdayBook 
    name? : NAME 
    date? : DATE
where
    name? \notin known 
    birthday′ = birthday \cup { name? \mapsto date? }
end 

schema FindBirthday 
    \Xi BirthdayBook 
    name? : NAME 
    date! : DATE
where
    name? \in known 
    date! = birthday ( name? )
end 

schema Remind 
	\Xi BirthdayBook 
    today? : DATE 
    cards! : \power NAME
 where
    cards! = { n : known | birthday ( n ) = today? }
 end
```

This **RemindOne** schema does not appear in Spivey, but is
included to show how non-deterministic schemas can be animated.
It reminds us of just one person who has a birthday on the given 
day.
```Z
schema RemindOne
  \Xi BirthdayBook
  today? : DATE
  card! : NAME
where
  card! \in known
  birthday card! = today?
end
```

Now we strengthen the specification by adding error handling.

```Z
zed
   REPORT ::= ok | already_known | not_known
end 
```

First we define auxiliary schemas that capture various success
and error cases.

```Z
schema Success 
    result! : REPORT
where
    result! = ok
end

schema AlreadyKnown 
    \Xi BirthdayBook 
    name? : NAME 
    result! : REPORT
where
    name? \in known 
    result! = already_known
end 


schema NotKnown 
    \Xi BirthdayBook 
    name? : NAME 
    result! : REPORT
where
    name? \notin known 
    result! = not_known
end
```

Finally, we define robust versions of all the operations
by specifying how errors are handled.  

```Z
zed
    RAddBirthday == ( AddBirthday \land Success ) \lor AlreadyKnown
end

zed
    RFindBirthday == ( FindBirthday \land Success ) \lor NotKnown
end

zed
    RRemind == Remind \land Success
end     
```

# References
<cite id="spivey1992">
J. Michael Spivey.  The Z Notation: A Reference Manual.
   <i>International Series in Computer Science</i>, Prentice-Hall International
  (UK) Ltd, second edition, 1992.
</cite>
