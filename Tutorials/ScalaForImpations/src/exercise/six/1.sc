val zones = java.util.TimeZone.getAvailableIDs
for (x <- zones) println(x)
zones.length

var zonesWithuotRegion = zones.map(_.split("/"))
zonesWithuotRegion.length
//Now we have got arrays of arrays
zonesWithuotRegion(0)
zonesWithuotRegion(0)(0)

val firstPartsOnly = zones.map(_.split("/")).filter( _.length > 1).map(_(1))
firstPartsOnly.length

val notSmallZones = zones.map(_.split("/")).filter( _.length > 1)
notSmallZones.length

val grouped = zones.map(_.split("/")).filter(_.length > 1) .map(a => a(1)).grouped(10)
for (k <- grouped.toArray) println(k(0))

println("\nFinal Result ***** \n\n\n")

val refined = zones.map(_.split("/")).filter(_.length > 1) .map(a => a(1)).grouped(10).toArray.map(x=> x(0))
refined.length

for (r <- refined) println(r)


