String.metaClass.isPalindrome = {-> ;
  delegate = delegate.replaceAll(/[^a-zA-ZâçûîðìíïþèòÇÛÎÂÐÌÍÏÞÈÒ]/,"")
  delegate == delegate.reverse()
  }
println ('m12/963o1245321651 1$@#%m'.isPalindrome())

movieTitles = ["Seven", "SnowWhite", "Die Hard"]
movieTitles.each({x -> if(x[0]=="S") println x})
