Herringbone
===========

This is a cut down version of stripe's [Herringbone](https://github.com/stripe/herringbone) project.

Our cutdown version of Herringbone only has support for compacting parquet files. It also works on an older version of parquet, and builds via sbt.

You can use herringbone by running:

    $ herringbone compact -i /path/to/input/directory -o /path/to/output/directory
