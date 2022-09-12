
void call(){
    return properties([
    parameters([
      
      choice( name:'invokeParams',choices:['y','n'],description:"SAMPLE")
      ])
    
    ])
}
