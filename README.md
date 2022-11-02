# Example for kamon-io/Kamon#1225

See the kamon-io/Kamon#1225 for details.

Run with `sbt run`.

If you change the line
```
      "io.kamon" %% "kamon-bundle" % "2.5.10",
```
to
```
      "io.kamon" %% "kamon-bundle" % "2.5.9",
```
in `build.sbt`, you will see the tag reappears.
