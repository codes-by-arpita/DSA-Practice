# A. Line Trip — Explanation

You are driving on a straight road:

- Start at position `0`
- Go to position `x`
- Then return back to `0`

Your car uses:

- `1 liter` of fuel for `1 unit` of distance.

---

## Important Details

You have gas stations at positions:

```text
a1, a2, ..., an
```

Whenever you reach a gas station:

- your tank becomes completely full again.

But:

- there is **NO** gas station at `0`
- there is **NO** gas station at `x`

---

# What Do We Need to Find?

We must find:

> the **minimum tank capacity** required to complete the whole trip.

---

# Key Observation

The car only needs enough fuel for the **largest distance traveled without refueling**.

---

# Very Important Part

While going:

```text
0 -> x
```

you can refill at gas stations.

But at point `x`:

- there is **NO** gas station.

So after reaching `x`, you must return to the previous gas station using the same fuel.

That means:

```text
distance from last station to x
```

must be traveled **twice**.

---

# Example 1

```text
n = 3
x = 7
stations = [1, 2, 5]
```

Road:

```text
0 ---1---2------5--7
```

Distances:

- `0 -> 1 = 1`
- `1 -> 2 = 1`
- `2 -> 5 = 3`
- `5 -> 7 = 2`

Normally the maximum gap is `3`.

But:

At `7`, there is no gas station.

So from station `5`:

```text
5 -> 7 -> 5
```

requires:

```text
2 + 2 = 4
```

So the answer becomes:

```text
max(1, 1, 3, 4) = 4
```

---

# Example 2

```text
x = 10
stations = [7]
```

Road:

```text
0 -------7---10
```

Distances:

- `0 -> 7 = 7`
- `7 -> 10 = 3`

But return from `10`:

```text
10 -> 7
```

needs another `3`.

So the last segment requires:

```text
3 * 2 = 6
```

Now compare:

```text
max(7, 6) = 7
```

Answer = `7`.

---

# Formula

The answer is:

```text
max(
    gaps between consecutive stations,
    2 * (x - last_station)
)
```

Also include the starting gap:

```text
a1 - 0
```

---

# Why Multiply Only the Last Gap by 2?

Because:

- every other place has a gas station where you can refill.
- point `x` has no gas station.

So only the final stretch must be covered both ways using one tank.