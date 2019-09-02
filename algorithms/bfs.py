import collections

def bfs_iterative(graph, root):
    visited, queue = set([root]), collections.deque([root])
    while queue:
        vertex = queue.popleft()
        print(vertex, end=" ")
        neighbours = graph[vertex]
        for node in neighbours:
            if node not in visited:
                visited.add(node)
                queue.append(node)

if __name__ == '__main__':
    graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}
    bfs_iterative(graph, 'A')