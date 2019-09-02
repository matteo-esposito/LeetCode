def countCharacters(words, chars):
    """
    :type words: List[str]
    :type chars: str
    :rtype: int
    """
    # Dict of all available chars
    avail = {}
    for c in chars:
        if c not in avail.keys():
            avail[c] = 1
        else:
            avail[c] += 1
    
    # Decrement the value associated to each key found in word.
    # if value < 0 break else add to good list.
    goods = []
    for word in words:
        status = True
        copy_avail = avail.copy()
        for char in word:
            if char in copy_avail.keys():
                copy_avail[char] -= 1
                if copy_avail[char] < 0:
                    status = False
            else:
                status = False
        if status:
            goods.append(word)
    
    sol = 0
    for g in goods:
        sol += len(g)
    
    return sol

if __name__ == '__main__':
    print(countCharacters(["cat","bt","hat","tree"], "atach")) # 6
    print(countCharacters(words = ["hello","world","leetcode"], chars = "welldonehoneyr")) # 10
                