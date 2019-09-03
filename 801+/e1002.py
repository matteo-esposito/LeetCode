def commonChars(A):
    """
    :type A: List[str]
    :rtype: List[str]
    """
    chars = {}
    for word in A:
        for c in word:
            if c in chars.keys():
                chars[c] += 1
            else:
                chars[c] = 1

    sol = []
    for c in chars:
        while (chars[c] > 0):
            if chars[c] - len(A) >= 0 and chars[c] != 0:
                sol += [c]
            chars[c] -= len(A)

    return sol

print(commonChars(["bella","label","roller"]))
print(commonChars(["cool","lock","cook"]))