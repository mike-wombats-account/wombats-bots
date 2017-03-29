(fn [state time-left]
  (let [move {:action :move
              :metadata {}}
        turn-left {:action :turn
                   :metadata {:direction :left}}
        turn-about {:action :turn
                    :metadata {:direction :about-face}}
        throw-smoke-left {:action :smoke
                          :metadata {:direction :left}}
        drop-smoke {:action :smoke}
        shoot {:action :shoot}]

    {:command shoot
     :state {}}))
