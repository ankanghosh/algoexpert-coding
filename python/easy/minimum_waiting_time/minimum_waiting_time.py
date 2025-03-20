# Function to find the minimum waiting time for all of the queries in an array.
# O(nlog(n)) time | O(1) space, where n is the total number of queries
def minimumWaitingTime(queries):
    # Sort the queries in ascending order to minimize the waiting time.
    queries.sort()

    totalWaitingTime = 0
    for idx, duration in enumerate(queries):
        # Calculate how many queries are left after the current one.
        queriesLeft = len(queries) - (idx + 1)
        # Accumulate the waiting time contribution of the current query.
        totalWaitingTime += queries[idx] * queriesLeft

    return totalWaitingTime