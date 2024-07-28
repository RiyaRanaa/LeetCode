class Solution(object):
    def secondMinimum(self, n, edges, time, change):
        """
        :type n: int
        :type edges: List[List[int]]
        :type time: int
        :type change: int
        :rtype: int
        """
        graph=[[] for _ in range(n+1)]
        for u,v in edges:
            graph[u].append(v)
            graph[v].append(u)
        q=deque([(1,1)])
        dist1=[-1]*(n+1)
        dist2=[-1]*(n+1)
        dist1[1]=0
        while q:
            x,freq=q.popleft()
            red_light=dist1[x] if freq==1 else dist2[x]
            if(red_light //change)%2:
                red_light=change*(red_light //change+1)+time
            else:
                red_light+=time
            for neighbor in graph[x]:
                if dist1[neighbor]==-1:
                    dist1[neighbor]=red_light
                    q.append((neighbor,1))
                elif dist2[neighbor]==-1 and dist1[neighbor]!=red_light:
                    if neighbor==n:
                        return red_light
                    dist2[neighbor]=red_light
                    q.append((neighbor,2))
        return 0 