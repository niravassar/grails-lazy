package grails.lazy

class Airport {
    String name
    static hasMany = [flights: Flight]
    static mapping = {
        // has no effect on # of sqls
        flights lazy: false
        // will reduce sqls
        //flights fetch: 'join'
    }
}
