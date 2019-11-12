String.metaClass.isPalindrome = {-> ;
  delegate = delegate.replaceAll(/[^a-zA-ZâçûîðìíïþèòÇÛÎÂÐÌÍÏÞÈÒ]/,"").toString().toLowerCase()
  delegate == delegate.reverse()
  }
println ('sSile, putra, kartupelis'.isPalindrome())

movieTitles = ["Seven", "SnowWhite", "Die Hard"]
movieTitles.each({x -> if(x[0]=="S") println x})
