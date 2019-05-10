package grails.lazy

class Flight {
    String number
    Location destination
    static belongsTo = [airport: Airport]

    static mapping = {
        // has no effect on # of sqls
        destination lazy: false
        // will reduce sqls
        // destination fetch: 'join'
    }
}
