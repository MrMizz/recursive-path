# recursive-path

* entry point `sh build.sh`

* this problem was
    * solved recursively
    * interpreted as find-all-paths-in-graph
      * all paths must be traversed to determine the cheapest path
        * potential arbitrage situations
    * does not include the conversion-rate aspect but could look like the following
      * instead of accumulating the paths as they grow, accumulate/apply the rate at each step
      * you'll end up with a list of rates instead of a list of paths
        * reduce/fold the rate list with a min/max function depending on your perspective
