from heapq import heappush, heappop

class Solution:
  def modifiedGraphEdges(self, n: int, edges: List[List[int]], source: int, destination: int, target: int) -> List[List[int]]:

    # Build edge disctionary
    e = self.buildEdges(edges)
    # Dijkstra from destination
    b = self.distancesFrom(destination, e, n)
    if 0 <= b[source] < target:
      return []

    # Dijkstra from source with modification of edge dictionary
    f = self.modifyWeights(source, destination, b, e, n, target)

    # Modify edge array if successful
    if f[destination] == target:
      for i in range(len(edges)):
        if edges[i][2] == -1:
          edges[i][2] = e[edges[i][0]][edges[i][1]]
      return edges
    else:
      return []

  
  def buildEdges(self, edges: List[List[int]]) -> dict[int, dict[int, int]]:
    e = defaultdict(dict)
    for a, b, w in edges:
      e[a][b] = w
      e[b][a] = w
    return e


  def distancesFrom(self, src: int, e: dict[int, dict[int, int]], n: int) -> List[int]:
    d = [-1] * n
    d[src] = 0
    q = [(0, src)]

    while len(q) > 0:
      du, u = heappop(q)
      if du > d[u] > 0:
        continue
      for v, w in e[u].items():
        if w > 0:
          duw = du + w
          if d[v] < 0 or duw < d[v]:
            d[v] = duw
            heappush(q, (d[v], v))
    return d


  def modifyWeights(self, src: int, dest: int, back: List[int], e: dict[int, dict[int, int]], n: int, target: int) -> List[int]:
    d = [-1] * n
    d[src] = 0
    q = [(0, src)]

    while len(q) > 0:
      du, u = heappop(q)
      if du > d[u] > 0:
        continue
      for v, w in e[u].items():
        if w < 0:
          nw = 1
          if back[v] >= 0 and du + back[v] < target:
            nw = target - du - back[v]
          e[u][v] = nw
          e[v][u] = nw

        duw = d[u] + e[u][v]
        if d[v] < 0 or duw < d[v]:
          d[v] = duw
          if v != dest:
            heappush(q, (d[v], v))
    return d


        