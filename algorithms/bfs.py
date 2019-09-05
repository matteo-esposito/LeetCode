def bfs_iterative(graph, root):
    queue = [root]
    visited = set(root)
    
    while queue:
        vertex = queue.pop()
        for node in graph[vertex]:
            if node not in visited:
                queue.append(node)
                visited.add(node)
    
    return visited

if __name__ == '__main__':
    graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}
    print(bfs_iterative(graph, 'A'))