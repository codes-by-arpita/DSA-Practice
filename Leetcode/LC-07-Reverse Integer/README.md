INTEGER OVERFLOW CONCEPT (LC 7 - Reverse Integer)

Java int range:
Integer.MAX_VALUE =  2147483647
Integer.MIN_VALUE = -2147483648

Problematic operation:
rev = rev * 10 + digit

Overflow can happen during:
1. rev * 10
2. + digit

So overflow must be checked BEFORE performing the operation.

--------------------------------------------------

POSITIVE OVERFLOW

Maximum allowed integer:
2147483647

Before multiplying by 10:

2147483647 / 10 = 214748364

Case 1:
If rev > 214748364,
then rev * 10 already exceeds int range.

Condition:
rev > Integer.MAX_VALUE / 10

--------------------------------------------------

EDGE CASE

If:
rev == 214748364

then multiplying by 10 gives:
2147483640

Now adding digit matters.

Largest safe digit:
7

Because max int is:
2147483647

So:

if (rev == Integer.MAX_VALUE / 10 && digit > 7)
    overflow occurs

--------------------------------------------------

NEGATIVE OVERFLOW

Minimum allowed integer:
-2147483648

Before multiplying by 10:

-2147483648 / 10 = -214748364

Case 1:
If rev < -214748364,
then rev * 10 already exceeds negative limit.

Condition:
rev < Integer.MIN_VALUE / 10

--------------------------------------------------

EDGE CASE

If:
rev == -214748364

then multiplying by 10 gives:
-2147483640

Now digit matters.

Smallest safe digit:
-8

Because min int is:
-2147483648

So:

if (rev == Integer.MIN_VALUE / 10 && digit < -8)
    overflow occurs

--------------------------------------------------

FINAL OVERFLOW CONDITIONS

Positive overflow:

if (rev > Integer.MAX_VALUE / 10 ||
   (rev == Integer.MAX_VALUE / 10 && digit > 7))

Negative overflow:

if (rev < Integer.MIN_VALUE / 10 ||
   (rev == Integer.MIN_VALUE / 10 && digit < -8))

--------------------------------------------------

KEY INTERVIEW POINT

Always check overflow BEFORE arithmetic operation,
because once overflow happens in Java int,
the value becomes corrupted/wrapped.