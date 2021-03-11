# Spark Demo with scala-uri

## Usage

Build the fatjar with the command below. This shades cats which is necessary for the meanwhile as spark 3
has a dependency on a milestone version of cats-kernel 2.0.0 which is binary incompatible with the released
versions of cats 2.x.x

```
sbt assembly
```

Then you should be able to run with:

```
YOUR_SPARK_INSTALL/bin/spark-submit \
  --class "example.UriDemo" \
  --master "local[4]" \
  target/scala-2.12/SparkExample-assembly-0.1.0-SNAPSHOT.jar
```

And you should see `www.example.com` printed to the console
