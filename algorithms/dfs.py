def dfs_recursive(graph, vertex, path = []):
    """Perform depth-first-search recursively
    
    Arguments:
        graph {dict} -- Graph data structure implemented as a dict of sets.
    """
    path += [vertex]
    for node in graph[vertex]:
        if node not in path:
            path = dfs_recursive(graph, node, path)
    return path

def dfs_iterative(graph, start):
    """Perform depth-first-search iteratively
    
    Arguments:
        graph {dict} -- Graph data structure implemented as a dict of sets.
    """
    stack, path = [start], []

    while stack:
        vertex = stack.pop()
        if vertex in path:
            continue # jump to next for loop
        path.append(vertex)
        for node in graph[vertex]:
            stack.append(node)
    
    return path


if __name__ == '__main__':
    graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}
    print(dfs_recursive(graph, 'A'))
    print(dfs_iterative(graph, 'A'))